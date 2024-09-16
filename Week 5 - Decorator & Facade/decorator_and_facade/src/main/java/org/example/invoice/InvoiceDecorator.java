package org.example.invoice;

public abstract class InvoiceDecorator implements InvoicePrice {
    protected InvoicePrice invoicePrice;

    public InvoiceDecorator(InvoicePrice invoicePrice) {
        this.invoicePrice = invoicePrice;
    }

    @Override
    public double getPrice() {
        return invoicePrice.getPrice();
    }
}
