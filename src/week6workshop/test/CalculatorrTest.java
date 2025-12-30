package week6workshop.test;
import week6workshop.Calculatorr;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class CalculatorrTest {

    static Calculatorr calculator;

    @BeforeAll
    static void beforeClass() {
        System.out.println("Starting Calculator Tests");
    }

    @BeforeEach
    void setUp() {
        calculator = new Calculatorr();
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test finished");
    }

    @AfterAll
    static void afterClass() {
        System.out.println("All tests completed");
    }

    @Test
    void testAddition() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void testSubtraction() {
        assertEquals(1, calculator.subtract(3, 2));
    }

    @Test
    void testMultiplication() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    void testDivision() {
        assertEquals(2, calculator.divide(6, 3));
    }
}
