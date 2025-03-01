public class Product {
    // Attributes
    private String name;  // The name of the product (e.g., "Laptop")
    private double price;  // The price of the product (e.g., 1000.0)
    private int quantity;  // The quantity of the product (e.g., 2)

    // Constructor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Methods
    public double getTotalPrice() {
        return price * quantity;  // Returns the total price (price * quantity)
    }

    public String getName() {
        return name;  // Returns the name of the product
    }

    public double getPrice() {
        return price;  // Returns the price of the product
    }

    public int getQuantity() {
        return quantity;  // Returns the quantity of the product
    }
}
