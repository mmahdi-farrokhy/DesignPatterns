package org.example.invoice;

public class InvoiceWithService extends InvoiceDecorator {
    public InvoiceWithService(InvoicePrice invoicePrice) {
        super(invoicePrice);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 15000;
    }
}
