package strategy.payment.methods;

import strategy.payment.Order;

public interface PaymentMethod {
    public void pay(Order order);
}
