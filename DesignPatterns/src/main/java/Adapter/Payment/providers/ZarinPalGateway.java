package Adapter.Payment.providers;

import Adapter.Payment.Invoice;
import Adapter.Payment.OnlineGateway;

public class ZarinPalGateway implements OnlineGateway {
    @Override
    public void startPayment(Invoice invoice) {
        System.out.println("Zarin Pal Gateway: start with amount " + invoice.getAmount());
    }
}
