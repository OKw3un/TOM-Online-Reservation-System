    package UserModels;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


    public class AdminUserTest {

        @Test
        public void testAdminUserConstructorAndGetters() {
            AdminUser user = new AdminUser("Admin", "User", "admin123", "01.01.2000", "admin@example.com", "admin");

            assertEquals("Admin User", user.getFullName());
           assertEquals("admin123", user.getPassword());
            assertEquals("01.01.2000", user.getBirthDate());
            assertEquals("admin@example.com", user.getEmail());
            assertEquals("admin", user.getUserType());
        }
/*
        @Test
        public void testShowDashboard() {
            AdminUser user = new AdminUser("Admin", "User", "admin123", "1985-01-01", "admin@example.com", "admin");
            // Since showDashboard prints to console, we can only verify it doesn't throw an
            // exception
            user.showDashboard();
        }*/
    }
