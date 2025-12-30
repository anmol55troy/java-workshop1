package week6workshop.test;

import week6workshop.EnrollmentService;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EnrollmentServiceTest {

    EnrollmentService service;

    @BeforeEach
    void setUp() {
        service = new EnrollmentService();
    }

    @Test
    void testSuccessfulEnrollment() {
        assertTrue(service.enrollStudent("anmol", "Java Programming"));
    }

    @Test
    void testDuplicateEnrollment() {
        service.enrollStudent("anmol", "Java Programming");
        assertFalse(service.enrollStudent("anmol", "Java Programming"));
    }

    @Test
    void testDifferentCoursesSameStudent() {
        assertTrue(service.enrollStudent("anmol", "Java"));
        assertTrue(service.enrollStudent("anmol", "Python"));
    }
}
