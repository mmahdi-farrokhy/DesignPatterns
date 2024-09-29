package Strategy.Payment.methods;

import Strategy.Payment.Order;

public interface PaymentMethod {
    public void pay(Order order);
}
