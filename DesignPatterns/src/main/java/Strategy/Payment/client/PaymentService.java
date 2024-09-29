package Strategy.Payment.client;

import Strategy.Payment.Order;
import Strategy.Payment.methods.PaymentMethod;
import lombok.Setter;

@Setter
public class PaymentService {
    private PaymentMethod paymentMethod;

    public void startPayment(Order order) {
        paymentMethod.pay(order);
    }
}
