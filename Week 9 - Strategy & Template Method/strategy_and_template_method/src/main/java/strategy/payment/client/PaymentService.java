package strategy.payment.client;

import strategy.payment.Order;
import strategy.payment.methods.PaymentMethod;

public class PaymentService {
    private PaymentMethod paymentMethod;

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void startPayment(Order order) {
        paymentMethod.pay(order);
    }
}
