package strategy.payment.methods;

import strategy.payment.Order;

public class CashPayment implements PaymentMethod {
    @Override
    public void pay(Order order) {
        System.out.println("CashPayment: pay() order:" + order);
    }
}
