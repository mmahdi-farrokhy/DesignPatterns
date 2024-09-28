package strategy.delivery.methods;

import strategy.delivery.DeliveryMethod;
import strategy.delivery.Order;

public class ExpressDelivery implements DeliveryMethod {
    @Override
    public double calculatePrice(Order order) {
        return order.getPrice();
    }

    @Override
    public void deliver(Order order) {

    }
}
