package week6workshop.test;
import week6workshop.InventoryService;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InventoryServiceTest {

    InventoryService inventory;

    @BeforeEach
    void setUp() {
        inventory = new InventoryService();
        inventory.addProduct("Laptop", 10);
    }

    @Test
    void testProductAvailable() {
        assertTrue(inventory.isProductAvailable("Laptop", 5));
    }

    @Test
    void testProductNotAvailableDueToLowStock() {
        assertFalse(inventory.isProductAvailable("Laptop", 15));
    }

    @Test
    void testProductNotAvailable() {
        assertFalse(inventory.isProductAvailable("Phone", 1));
    }
}
