package week6workshop.test;
import week6workshop.StringManipulator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringManipulatorTest {

    @Test
    void testAllMethods() {
        StringManipulator sm = new StringManipulator();

        assertAll(
            () -> assertEquals("olleh", sm.reverse("hello")),
            () -> assertEquals("HELLO", sm.toUpperCase("hello")),
            () -> assertTrue(sm.isPalindrome("madam")),
            () -> assertEquals(2, sm.countVowels("hello"))
        );
    }
}
