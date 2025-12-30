package week6workshop.test;
import week6workshop.LibraryService;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class LibraryServiceTest {

    static LibraryService library;

    @BeforeAll
    static void beforeClass() {
        library = new LibraryService();
    }

    @BeforeEach
    void setUp() {
        library.addBook("Java Programming");
    }

    @AfterEach
    void cleanUp() {
        System.out.println("Test executed");
    }

    @AfterAll
    static void afterClass() {
        System.out.println("Library tests completed");
    }

    @Test
    void testSearchExistingBook() {
        assertTrue(library.searchBook("Java Programming"));
    }

    @Test
    void testSearchNonExistingBook() {
        assertFalse(library.searchBook("Python"));
    }
}
