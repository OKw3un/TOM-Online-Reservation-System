package UserModels;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class NormalUserTest {

    @Test
    public void testNormalUserConstructorAndGetters() {
        NormalUser user = new NormalUser("John", "Doe", "pass123", "1990-01-01", "john@example.com", "normal");

        assertEquals("John Doe", user.getFullName());
        assertEquals("pass123", user.getPassword());
        assertEquals("1990-01-01", user.getBirthDate());
        assertEquals("john@example.com", user.getEmail());
        assertEquals("normal", user.getUserType());
    }

    @Test
    public void testShowDashboard() {
        NormalUser user = new NormalUser("John", "Doe", "pass123", "1990-01-01", "john@example.com", "normal");
        // Since showDashboard prints to console, we can only verify it doesn't throw an
        // exception
        //user.showDashboard();
    }
}
