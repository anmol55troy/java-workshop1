package week6workshop.test;
import week6workshop.PrimeUtils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrimeUtilsTest {

    @Test
    void testIsPrime() {
        PrimeUtils utils = new PrimeUtils();

        assertTrue(utils.isPrime(7));   // prime
        assertTrue(utils.isPrime(2));   // smallest prime

        assertFalse(utils.isPrime(1));  // not prime
        assertFalse(utils.isPrime(0));  // not prime
        assertFalse(utils.isPrime(-5)); // not prime
        assertFalse(utils.isPrime(10)); // not prime
    }
}
