package Adapter.Payment;

public interface OnlineGateway {
    void startPayment(Invoice invoice);
}
