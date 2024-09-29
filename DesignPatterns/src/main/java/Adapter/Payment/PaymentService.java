package Adapter.Payment;

public class PaymentService {
    private OnlineGateway paymentGateway;

    public PaymentService(OnlineGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void payInvoice(Invoice invoice) {
        paymentGateway.startPayment(invoice);
    }
}
