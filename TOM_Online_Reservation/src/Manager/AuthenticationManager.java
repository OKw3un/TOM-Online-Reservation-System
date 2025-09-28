package Manager;

import java.util.HashMap;
import Factories.*;
import UserModels.User;

/**
 * AuthenticationManager is a singleton class responsible for managing user
 * registration and login operations.
 */
public class AuthenticationManager {

    private static AuthenticationManager instance = null; // Singleton instance
    private HashMap<String, User> users = new HashMap<>(); // Stores users keyed by email

    /**
     * Private constructor to prevent instantiation.
     */
    private AuthenticationManager() {}

    /**
     * Returns the singleton instance of AuthenticationManager.
     *
     * @return the AuthenticationManager instance
     */
    public static AuthenticationManager getInstance() {
        if (instance == null) {
            instance = new AuthenticationManager();
        }
        return instance;
    }

    /**
     * Registers a new user if the email is not already taken.
     *
     * @param name the user's first name
     * @param surname the user's surname
     * @param password the user's password
     * @param birthDate the user's birth date
     * @param email the user's email (used as unique identifier)
     * @param userType the type of user ("normal" or "admin")
     */
    public void register(String name, String surname, String password,
                         String birthDate, String email, String userType) {
        if (!users.containsKey(email)) {
            User user = UserFactory.createUser(name, surname, password, birthDate, email, userType);
            users.put(email, user);
            System.out.println("User has been signed up successfully: " + name);
        } else {
            System.out.println("This email is already being used.");
        }
    }

    /**
     * Attempts to log in a user by checking email and password.
     *
     * @param email the user's email
     * @param password the user's password
     * @return the User object if login is successful; null otherwise
     */
    public User login(String email, String password) {
        User user = users.get(email);
        if (user != null && user.checkPassword(password)) {
            System.out.println("Login successful!");
            return user;
        } else {
            System.out.println("Login unsuccessful!");
            return null;
        }
    }

    /**
     * Checks if an email is already registered.
     *
     * @param email the email to check
     * @return true if the email is taken; false otherwise
     */
    public boolean isEmailTaken(String email) {
        return users.containsKey(email);
    }
}