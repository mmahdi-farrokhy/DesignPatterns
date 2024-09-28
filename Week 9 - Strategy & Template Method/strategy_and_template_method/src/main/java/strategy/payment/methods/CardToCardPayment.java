package strategy.payment.methods;

import strategy.payment.Order;

public class CardToCardPayment implements PaymentMethod {
    @Override
    public void pay(Order order) {
        System.out.println("CardToCardPayment: pay() order:" + order);
    }
}
