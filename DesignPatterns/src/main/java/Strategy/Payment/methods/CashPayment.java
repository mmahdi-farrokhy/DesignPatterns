package Strategy.Payment.methods;

import Strategy.Payment.Order;

public class CashPayment implements PaymentMethod {
    @Override
    public void pay(Order order) {
        System.out.println("CashPayment: pay() order:" + order);
    }
}
