package Strategy.Delivery.methods;

import Strategy.Delivery.Order;

public class MotorCycleDelivery implements DeliveryMethod {
    @Override
    public double calculatePrice(Order order) {
        return order.getPrice() * order.getDistance();
    }

    @Override
    public void deliver(Order order) {
        System.out.println("MotorCycleDelivery: deliver() order:" + order);
    }
}
