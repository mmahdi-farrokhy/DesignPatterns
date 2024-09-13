package org.example.adapter.payment.providers;

import org.example.adapter.payment.Invoice;
import org.example.adapter.payment.OnlineGateway;

public class MellatGateway implements OnlineGateway {
    @Override
    public void startPayment(Invoice invoice) {
        System.out.println("Mellat Bank Gateway: start with amount " + invoice.getAmount());
    }
}
