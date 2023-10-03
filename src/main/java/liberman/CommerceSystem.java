package liberman;

public class CommerceSystem {
    public static void main(String[] args) {
        Product laptop = new Product(1, "Laptop", 999.99F);
        Product smartphone = new Product(2, "Smartphone", 499.99F);

        Cart cart = new Cart();
        cart.addProduct(laptop);
        cart.addProduct(smartphone);

        System.out.println("Cart Contents:");
        for (Product product : cart.getProducts()) {
            System.out.println(product.getName() + " - $" + product.getPrice());

            Order order = new Order(cart.getProducts());
            System.out.println("\nOrder placed. Order ID: " + order.getOrderId());

            order.setStatus(Status.PROCESSING);
            System.out.println("Order Status: " + order.getStatus());
        }
    }
}
