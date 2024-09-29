package Strategy.Payment.methods;

import Strategy.Payment.Order;

public class CardToCardPayment implements PaymentMethod {
    @Override
    public void pay(Order order) {
        System.out.println("CardToCardPayment: pay() order:" + order);
    }
}
