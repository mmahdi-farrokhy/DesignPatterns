package Strategy.Delivery.client;

import Strategy.Delivery.Order;
import Strategy.Delivery.methods.DeliveryMethod;
import Strategy.Delivery.methods.ExpressDelivery;

public class DeliveryController {
    private DeliveryMethod deliveryMethod;

    public DeliveryController(DeliveryMethod deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public void deliverOrder(Order order) {
        DeliveryService deliveryService = new DeliveryService(new ExpressDelivery());
        deliveryService.deliver(order);
    }
}
