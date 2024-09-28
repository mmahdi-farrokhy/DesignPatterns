package strategy.payment.methods;

import strategy.payment.Order;

public class OnlinePayment implements PaymentMethod {
    @Override
    public void pay(Order order) {
        System.out.println("OnlinePayment: pay() order:" + order);
    }
}
