package org.example.bridge.payment.handlers;

import org.example.bridge.payment.Invoice;
import org.example.bridge.payment.PaymentHandler;

public class CardToCardHandler implements PaymentHandler {
    @Override
    public void pay(Invoice invoice) {
        System.out.println("CardToCardHandler: pay");
    }
}
