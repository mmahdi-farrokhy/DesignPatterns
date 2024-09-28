package strategy.payment.methods;

import strategy.payment.Order;

public class CreditPayment implements PaymentMethod {
    @Override
    public void pay(Order order) {
        if (order.getPrice() > order.getCustomer().getCredit()) {
            throw new Error("your credit is not enough to pay this order.");
        }

        System.out.println("CreditPayment: pay() order:" + order);
    }
}
