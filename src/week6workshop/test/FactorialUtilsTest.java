package week6workshop.test;
import week6workshop.FactorialUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialUtilsTest {

    @Test
    void testFactorial() {
        FactorialUtils utils = new FactorialUtils();

        assertEquals(1, utils.factorial(0));   // edge case
        assertEquals(1, utils.factorial(1));
        assertEquals(2, utils.factorial(2));
        assertEquals(6, utils.factorial(3));
        assertEquals(120, utils.factorial(5));
    }
}

