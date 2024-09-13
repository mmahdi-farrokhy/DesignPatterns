package org.example.bridge.payment.methods;

import org.example.bridge.payment.Invoice;
import org.example.bridge.payment.PaymentHandler;
import org.example.bridge.payment.PaymentMethod;

public class CashMethod extends PaymentMethod {

    public CashMethod(PaymentHandler paymentHandler) {
        super(paymentHandler);
    }

    @Override
    public void startPay(Invoice invoice) {
        paymentHandler.pay(invoice);
    }
}
