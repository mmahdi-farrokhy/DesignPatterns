package Bridge.Payment.methods;

import Bridge.Payment.Invoice;
import Bridge.Payment.PaymentHandler;
import Bridge.Payment.PaymentMethod;

public class ChequePayment extends PaymentMethod {

    public ChequePayment(PaymentHandler paymentHandler) {
        super(paymentHandler);
    }

    @Override
    public void startPay(Invoice invoice) {
        paymentHandler.pay(invoice);
    }
}
