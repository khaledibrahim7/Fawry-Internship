public class OrderProcessor {
    public void placeOrder(ShoppingCart cart) {
        for (Product product : cart.getItems()) {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }
        double totalCost = cart.calculateTotalCost();
        System.out.println("Total Cost: $" + totalCost);

    }
}
