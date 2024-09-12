package org.example.builder.order;

import java.util.Date;
import java.util.List;

public class OrderBuilder {
    private String customer;
    private double totalPrice;
    private double finalPrice;
    private Date createdAt;
    private String deliveryAddress;
    private String status;
    private List<OrderItem> items;
    private Order order;

    private OrderBuilder(Order order) {
        this.order = order;
    }

    public static OrderBuilder anOrder(Order order) {
        return new OrderBuilder(order);
    }

    public OrderBuilder withCustomer(String customer) {
        this.customer = customer;
        return this;
    }

    public OrderBuilder withTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    public OrderBuilder withFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
        return this;
    }

    public OrderBuilder withCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public OrderBuilder withDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
        return this;
    }

    public OrderBuilder withStatus(String status) {
        this.status = status;
        return this;
    }

    public OrderBuilder withItems(List<OrderItem> items) {
        this.items = items;
        return this;
    }

    public Order build() {
        return new Order(
                this.customer != null ? this.customer : this.order.getCustomer(),
                this.totalPrice != 0 ? this.totalPrice : this.order.getTotalPrice(),
                this.finalPrice != 0 ? this.finalPrice : this.order.getFinalPrice(),
                this.createdAt != null ? this.createdAt : this.order.getCreatedAt(),
                this.deliveryAddress != null ? this.deliveryAddress : this.order.getDeliveryAddress(),
                this.status != null ? this.status : this.order.getStatus(),
                this.items != null ? this.items : this.order.getItems()
        );
    }
}
