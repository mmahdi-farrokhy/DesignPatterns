package strategy.delivery;

import strategy.delivery.Order;

public interface DeliveryMethod {
    public double calculatePrice(Order order);

    public void deliver(Order order);
}
