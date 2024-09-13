package org.example.adapter.payment.providers;

public class SamanGateway { // third party package
    public void pay(double amount) {
        System.out.println("Saman Bank Gateway: start with amount " + amount);
    }
}
