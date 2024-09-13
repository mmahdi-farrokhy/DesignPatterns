package org.example.adapter.payment;

public interface OnlineGateway {
    void startPayment(Invoice invoice);
}
