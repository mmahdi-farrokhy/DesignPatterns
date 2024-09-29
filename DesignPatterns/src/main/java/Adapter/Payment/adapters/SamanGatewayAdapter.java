package Adapter.Payment.adapters;

import Adapter.Payment.Invoice;
import Adapter.Payment.OnlineGateway;
import Adapter.Payment.providers.SamanGateway;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SamanGatewayAdapter implements OnlineGateway {
    private SamanGateway samanGateway;

    @Override
    public void startPayment(Invoice invoice) {
        samanGateway.pay(invoice.getAmount());
    }
}
