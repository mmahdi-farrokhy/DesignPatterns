package Strategy.Delivery.client;

import Strategy.Delivery.Order;
import Strategy.Delivery.methods.DeliveryMethod;

public class DeliveryService {
    private DeliveryMethod deliveryMethod;

    public DeliveryService(DeliveryMethod deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public void deliver(Order order) {
        double deliveryPrice = deliveryMethod.calculatePrice(order);
        deliveryMethod.deliver(order);
    }
}