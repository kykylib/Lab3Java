package liberman;

import javax.print.attribute.standard.OrientationRequested;
import java.util.List;

public class Order {
    private static int orderCounter = 1;
    private int orderId;
    private List<Product> products;
    private Status status;

    public Order(List<Product> products) {
        this.orderId = orderCounter++;
        this.products = products;
        this.status = Status.PENDING;
    }

    public int getOrderId() {
        return orderId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
