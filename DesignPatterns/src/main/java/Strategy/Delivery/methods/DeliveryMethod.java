package Strategy.Delivery.methods;

import Strategy.Delivery.Order;

public interface DeliveryMethod {
    public double calculatePrice(Order order);

    public void deliver(Order order);
}
