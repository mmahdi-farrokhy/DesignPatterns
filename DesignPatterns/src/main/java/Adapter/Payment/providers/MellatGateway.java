package Adapter.Payment.providers;

import Adapter.Payment.Invoice;
import Adapter.Payment.OnlineGateway;

public class MellatGateway implements OnlineGateway {
    @Override
    public void startPayment(Invoice invoice) {
        System.out.println("Mellat Bank Gateway: start with amount " + invoice.getAmount());
    }
}
