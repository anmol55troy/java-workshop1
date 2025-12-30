package week6workshop;

public class Product {
    public String name;
    public double price;
    int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public boolean isAffordable(double budget) {
        return price * quantity <= budget;
    }
}
