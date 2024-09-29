package Strategy.Payment.client;

import Strategy.Payment.Customer;
import Strategy.Payment.Order;
import Strategy.Payment.methods.CreditPayment;

public class Client {
    public void paymentOrder() {
        Order order = new Order(100, new Customer());
        PaymentService paymentService = new PaymentService();
        paymentService.setPaymentMethod(new CreditPayment());
        paymentService.startPayment(order);
    }
}
