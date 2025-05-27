package streams;

import java.util.List;

public class Orders {
    private int orderId;
    private String orderItems;
    private int quantity;
    private double totalPrice;

    public Orders(int orderId, String orderItems, int quantity, double totalPrice) {
        this.orderId = orderId;
        this.orderItems = orderItems;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderId=" + orderId +
                ", orderItems=" + orderItems +
                ", quantity=" + quantity +
                ", totalPrice=" + totalPrice +
                '}';
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(String orderItems) {
        this.orderItems = orderItems;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
