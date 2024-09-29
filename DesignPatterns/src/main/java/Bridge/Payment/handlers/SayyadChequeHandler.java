package Bridge.Payment.handlers;

import Bridge.Payment.Invoice;
import Bridge.Payment.PaymentHandler;

public class SayyadChequeHandler implements PaymentHandler {
    @Override
    public void pay(Invoice invoice) {
        System.out.println("Sayyad: pay");
    }
}
