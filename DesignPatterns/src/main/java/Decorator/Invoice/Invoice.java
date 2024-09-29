package Decorator.Invoice;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Invoice implements InvoicePrice {
    private final double price;

    @Override
    public double getPrice() {
        return price;
    }
}
