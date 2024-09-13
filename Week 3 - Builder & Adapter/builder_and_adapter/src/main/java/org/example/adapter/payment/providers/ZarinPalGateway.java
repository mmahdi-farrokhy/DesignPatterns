package org.example.adapter.payment.providers;

import org.example.adapter.payment.Invoice;
import org.example.adapter.payment.OnlineGateway;

public class ZarinPalGateway implements OnlineGateway {
    @Override
    public void startPayment(Invoice invoice) {
        System.out.println("Zarin Pal Gateway: start with amount " + invoice.getAmount());
    }
}
