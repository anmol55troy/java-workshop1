package week6workshop.test;

import week6workshop.Product;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ProductTest {

    @Test
    void testProductUsingAssertAll() {
        Product p = new Product("Laptop", 500, 1);

        assertAll(
            () -> assertNotNull(p.name),
            () -> assertTrue(p.price > 0),
            () -> assertTrue(p.isAffordable(600)),
            () -> assertFalse(p.isAffordable(400))
        );
    }
}

