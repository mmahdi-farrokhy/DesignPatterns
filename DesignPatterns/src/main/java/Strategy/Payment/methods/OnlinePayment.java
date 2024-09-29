package Strategy.Payment.methods;

import Strategy.Payment.Order;

public class OnlinePayment implements PaymentMethod {
    @Override
    public void pay(Order order) {
        System.out.println("OnlinePayment: pay() order:" + order);
    }
}
