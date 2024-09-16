package org.example.invoice;

public class InvoiceWithVAT extends InvoiceDecorator {
    public InvoiceWithVAT(InvoicePrice invoicePrice) {
        super(invoicePrice);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + (super.getPrice() * 0.09);
    }
}
