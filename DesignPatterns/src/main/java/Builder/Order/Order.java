package Builder.Order;

import java.util.Date;
import java.util.List;

public class Order {
    private String customer;
    private double totalPrice;
    private double finalPrice;
    private Date createdAt;
    private String deliveryAddress;
    private String status;
    private List<OrderItem> items;

    public Order(String customer, double totalPrice, double finalPrice, Date createdAt, String deliveryAddress, String status, List<OrderItem> items) {
        this.customer = customer;
        this.totalPrice = totalPrice;
        this.finalPrice = finalPrice;
        this.createdAt = createdAt;
        this.deliveryAddress = deliveryAddress;
        this.status = status;
        this.items = items;
    }

    public String getCustomer() {
        return customer;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public String getStatus() {
        return status;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void cancel() {
        this.status = "cancelled";
    }
}
