package strategy.payment;

import strategy.payment.methods.CreditPayment;

public class Client {
    public void paymentOrder() {
        Order order = new Order(100, new Customer());
        PaymentService paymentService = new PaymentService();
        paymentService.setPaymentMethod(new CreditPayment());
        paymentService.startPayment(order);
    }
}
