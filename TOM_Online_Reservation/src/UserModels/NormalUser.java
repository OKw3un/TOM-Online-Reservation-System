package UserModels;

/**
 * For user who are normal users.
 */

public class NormalUser extends User {
    public NormalUser(String name, String surname, String password,
                      String birthDate, String email, String userType) {
        super(name, surname, password, birthDate, email, userType);
    }

}