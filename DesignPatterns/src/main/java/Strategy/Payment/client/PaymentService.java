package Strategy.Payment.client;

import Strategy.Payment.Order;
import Strategy.Payment.methods.PaymentMethod;

public class PaymentService {
    private PaymentMethod paymentMethod;

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void startPayment(Order order) {
        paymentMethod.pay(order);
    }
}
