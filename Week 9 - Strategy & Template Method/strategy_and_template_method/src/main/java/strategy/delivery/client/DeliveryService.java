package strategy.delivery.client;

import strategy.delivery.Order;
import strategy.delivery.methods.DeliveryMethod;

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
