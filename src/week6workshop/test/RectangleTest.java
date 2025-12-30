package week6workshop.test;

import week6workshop.Rectangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

 public class RectangleTest {

    @Test
    void testRectangleCalculations() {
        Rectangle rectangle = new Rectangle(5, 10);

        assertEquals(50, rectangle.area());
        assertEquals(30, rectangle.perimeter());
    }
}
