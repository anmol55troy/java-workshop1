package week6workshop;

import java.util.HashMap;
import java.util.Map;

public class InventoryService {

    private Map<String, Integer> stock = new HashMap<>();

    // Add product to inventory
    public void addProduct(String productName, int quantity) {
        stock.put(productName, quantity);
    }

    // Check availability
    public boolean isProductAvailable(String productName, int quantity) {
        if (!stock.containsKey(productName)) {
            return false;
        }
        return stock.get(productName) >= quantity;
    }
}

