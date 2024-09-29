package Decorator.Invoice;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class InvoiceDecorator implements InvoicePrice {
    protected InvoicePrice invoicePrice;

    @Override
    public double getPrice() {
        return invoicePrice.getPrice();
    }
}
