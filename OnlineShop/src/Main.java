import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1000);
        Product product2 = new Product("Smartphone", 800);
        Product product3 = new Product("Headphones", 50);

        ShoppingCart cart = new ShoppingCart();
        cart.addItem(product1);
        cart.addItem(product2);
        cart.addItem(product3);
        double totalCost = cart.calculateTotalCost();
        System.out.println("Total Cost in Shopping Cart: $" + totalCost);

        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.placeOrder(cart);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. View product details");
            System.out.println("2. Add product to cart");
            System.out.println("3. Remove product from cart");
            System.out.println("4. View cart");
            System.out.println("5. place order");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    viewProductDetails(cart);
                    break;
                case 2:
                    addProductToCart(cart, scanner);
                    break;
                case 3:
                    removeProductFromCart(cart, scanner);
                    break;
                case 4:
                    System.out.println("Items in Cart:");
                    for (Product item : cart.getItems()) {
                        System.out.println(item);
                    }
                    break;
                case 5:
                    orderProcessor.placeOrder(cart);
                    break;
                case 6:
                    Exit(scanner);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private static void Exit(Scanner scanner) {
        System.out.println("Goodbye!");
        scanner.close();
        System.exit(0);
    }

    private static void removeProductFromCart(ShoppingCart cart, Scanner scanner) {
        System.out.println("Enter product name: ");
        scanner.nextLine();
        String productToRemove = scanner.nextLine();
        Iterator<Product> iterator = cart.getItems().iterator();
        while (iterator.hasNext()) {
            Product p2 = iterator.next();
            if (p2.getName().equals(productToRemove)) {
                iterator.remove();
                return;
            }
        }
        System.out.println("Product not found in cart!");
    }


    private static void addProductToCart(ShoppingCart cart, Scanner scanner) {
        System.out.println("Enter product name: ");
        scanner.nextLine();
        String productName = scanner.nextLine();
        System.out.println("enter product price");
        double productPrice = scanner.nextDouble();
        Product p1 = new Product(productName, productPrice);
        cart.addItem(p1);
    }

    public static void viewProductDetails(ShoppingCart cart) {
        System.out.println("Product Details:");
        for (Product product : cart.getItems()) {
            System.out.println(product.getName() + "----" + product.getPrice());
        }
    }
}
