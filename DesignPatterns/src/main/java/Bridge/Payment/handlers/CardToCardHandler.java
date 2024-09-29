package Bridge.Payment.handlers;

import Bridge.Payment.Invoice;
import Bridge.Payment.PaymentHandler;

public class CardToCardHandler implements PaymentHandler {
    @Override
    public void pay(Invoice invoice) {
        System.out.println("CardToCardHandler: pay");
    }
}
