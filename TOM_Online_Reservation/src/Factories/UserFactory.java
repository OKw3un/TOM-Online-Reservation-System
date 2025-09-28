package Factories;

import UserModels.*;

/**
 * UserFactory is a factory class responsible for creating User instances
 * based on the specified user type.
 */
public class UserFactory {

    /**
     * Creates a User instance depending on the userType parameter.
     *
     * @param name the user's first name
     * @param surname the user's last name
     * @param password the user's password
     * @param birthDate the user's birth date
     * @param email the user's email address
     * @param userType the type of user ("normal" or "admin")
     * @return a User instance corresponding to the specified type
     * @throws IllegalArgumentException if userType is null or invalid
     */
    public static User createUser(String name, String surname, String password, String birthDate, String email, String userType) {
        if (userType == null) {
            throw new IllegalArgumentException("User type can't be null.");
        }

        switch (userType.trim().toLowerCase()) {
            case "normal":
                return new NormalUser(name, surname, password, birthDate, email, userType);
            case "admin":
                return new AdminUser(name, surname, password, birthDate, email, userType);
            default:
                throw new IllegalArgumentException("Invalid user type: " + userType);
        }
    }
}