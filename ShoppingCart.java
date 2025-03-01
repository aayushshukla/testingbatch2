import java.util.List;
import java.util.ArrayList;

public class ShoppingCart {
    // Attribute
    private List<Product> products;  // A list to store products in the cart

    // Constructor
    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    // Methods
    public void addProduct(Product product) {
        this.products.add(product);  // Adds a product to the cart
    }

    public double getTotalPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.getTotalPrice();  // Calculates the total price of all products in the cart
        }
        return total;
    }

    public int getProductCount() {
        return products.size();  // Returns the number of products in the cart
    }

    public List<Product> getProducts() {
        return products;  // Returns the list of products in the cart
    }
}
