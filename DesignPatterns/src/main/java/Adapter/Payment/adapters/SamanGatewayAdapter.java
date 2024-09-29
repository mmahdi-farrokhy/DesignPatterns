package Adapter.Payment.adapters;

import Adapter.Payment.Invoice;
import Adapter.Payment.OnlineGateway;
import Adapter.Payment.providers.SamanGateway;

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
