package UserModels;

import org.junit.Test;
import static org.junit.Assert.*;

public class UserTest {
    private class TestUser extends User {
        public TestUser(String name, String surname, String password, String birthDate, String email, String userType) {
            super(name, surname, password, birthDate, email, userType);
        }

        public void showDashboard() {
            System.out.println("Test Dashboard");
        }
    }

    @Test
    public void testUserConstructorAndGetters() {
        User user = new TestUser("John", "Doe", "pass123", "1990-01-01", "john@example.com", "normal");

        assertEquals("John Doe", user.getFullName());
        assertEquals("pass123", user.getPassword());
        assertEquals("1990-01-01", user.getBirthDate());
        assertEquals("john@example.com", user.getEmail());
        assertEquals("normal", user.getUserType());
    }

    @Test
    public void testCheckPassword() {
        User user = new TestUser("John", "Doe", "pass123", "1990-01-01", "john@example.com", "normal");

        assertTrue(user.checkPassword("pass123"));
        assertFalse(user.checkPassword("wrongpass"));
    }
}
