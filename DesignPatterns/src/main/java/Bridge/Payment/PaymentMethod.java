package Bridge.Payment;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class PaymentMethod {
    protected PaymentHandler paymentHandler;

    public abstract void startPay(Invoice invoice);
}
