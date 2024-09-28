package strategy.delivery.client;

import strategy.delivery.Order;
import strategy.delivery.methods.DeliveryMethod;
import strategy.delivery.methods.ExpressDelivery;

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
