package Bridge.Payment.methods;

import Bridge.Payment.Invoice;
import Bridge.Payment.PaymentHandler;
import Bridge.Payment.PaymentMethod;

public class CashMethod extends PaymentMethod {

    public CashMethod(PaymentHandler paymentHandler) {
        super(paymentHandler);
    }

    @Override
    public void startPay(Invoice invoice) {
        paymentHandler.pay(invoice);
    }
}
