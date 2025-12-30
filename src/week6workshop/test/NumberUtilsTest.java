package week6workshop.test;
import week6workshop.NumberUtils;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;

public class NumberUtilsTest {

    @Test
    void testGetEvenNumbers() {
        int[] input = {1,2,3,4,5,6};
        List<Integer> expected = List.of(2,4,6);

        assertEquals(expected, NumberUtils.getEvenNumbers(input));
    }
}
