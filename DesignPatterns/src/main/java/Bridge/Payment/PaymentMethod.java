package Bridge.Payment;

public abstract class PaymentMethod {
    protected PaymentHandler paymentHandler;

    public PaymentMethod(PaymentHandler paymentHandler) {
        this.paymentHandler = paymentHandler;
    }

    public abstract void startPay(Invoice invoice);
}
