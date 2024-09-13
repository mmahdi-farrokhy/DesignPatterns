package org.example.adapter.payment.adapters;

import org.example.adapter.payment.Invoice;
import org.example.adapter.payment.OnlineGateway;
import org.example.adapter.payment.providers.SamanGateway;

public class SamanGatewayAdapter implements OnlineGateway {
    private SamanGateway samanGateway;

    public SamanGatewayAdapter(SamanGateway samanGateway) {
        this.samanGateway = samanGateway;
    }

    @Override
    public void startPayment(Invoice invoice) {
        samanGateway.pay(invoice.getAmount());
    }
}
