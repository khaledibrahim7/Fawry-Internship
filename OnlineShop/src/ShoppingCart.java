import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final ArrayList<Product> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Product product) {
        items.add(product);
        System.out.println("product "+ product.getName() +" has been added successfully");
    }

    public void removeItem(Product product) {
        items.remove(product);
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (Product product : items) {
            totalCost += product.getPrice();
        }
        return totalCost;
    }

    public List<Product> getItems() {
        return items;
    }
}
