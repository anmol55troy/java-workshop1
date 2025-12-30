package week6workshop.test;
import week6workshop.NotificationService;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class NotificationServiceTest {

    NotificationService service = new NotificationService();

    @Test
    void testValidEmail() {
        assertTrue(service.sendEmail("test@gmail.com", "Hello"));
    }

    @Test
    void testInvalidEmail() {
        assertFalse(service.sendEmail("testgmail.com", "Hello"));
    }

    @Test
    void testNullEmail() {
        assertFalse(service.sendEmail(null, "Hello"));
    }
}

