package Strategy.Delivery.client;

import Strategy.Delivery.Order;
import Strategy.Delivery.methods.DeliveryMethod;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DeliveryService {
    private DeliveryMethod deliveryMethod;

    public void deliver(Order order) {
        double deliveryPrice = deliveryMethod.calculatePrice(order);
        deliveryMethod.deliver(order);
    }
}
