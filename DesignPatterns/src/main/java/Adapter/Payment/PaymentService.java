package Adapter.Payment;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PaymentService {
    private OnlineGateway paymentGateway;

    public void payInvoice(Invoice invoice) {
        paymentGateway.startPayment(invoice);
    }
}
