package org.example.invoice;

public class Invoice implements InvoicePrice {
    private final double price;

    public Invoice(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
