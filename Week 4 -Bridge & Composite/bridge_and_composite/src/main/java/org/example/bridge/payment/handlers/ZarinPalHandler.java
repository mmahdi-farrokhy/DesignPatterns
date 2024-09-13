package org.example.bridge.payment.handlers;

import org.example.bridge.payment.Invoice;
import org.example.bridge.payment.PaymentHandler;

public class ZarinPalHandler implements PaymentHandler {
    @Override
    public void pay(Invoice invoice) {
        System.out.println("ZarinPalHandler: pay");
    }
}
