package org.example.builder.order;

public class OrderService {
    public Order reorder(Order order) {
        order.cancel();
        return OrderBuilder.anOrder(order)
                .withDeliveryAddress("Tehran, Pardis")
                .build();
    }
}
