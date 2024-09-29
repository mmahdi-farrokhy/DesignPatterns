package Strategy.Delivery.methods;

import Strategy.Delivery.Order;

public class ExpressDelivery implements DeliveryMethod {
    @Override
    public double calculatePrice(Order order) {
        return order.getPrice();
    }

    @Override
    public void deliver(Order order) {

    }
}
