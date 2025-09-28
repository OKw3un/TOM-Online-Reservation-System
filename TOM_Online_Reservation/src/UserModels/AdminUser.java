package UserModels;

/**
 * For users who are admins.
 */

public class AdminUser extends User {
    public AdminUser(String name, String surname, String password,
                     String birthDate, String email, String userType) {
        super(name, surname, password, birthDate, email, userType);
    }

    public void showDashboard() {
        System.out.println("Admin Dashboard is displayed here.");
    }
 
}