package org.example.invoice;

public class InvoiceService {
    private InvoicePrice invoicePrice;
    private Invoice invoice;

    public InvoiceService(InvoicePrice invoicePrice) {
        this.invoicePrice = invoicePrice;
    }

    public InvoiceService(Invoice invoice) {
        this.invoice = invoice;
    }

    public double getInvoicePrice() {
        return invoicePrice.getPrice();
    }

    public double getDecoratedPrice() {
        InvoiceWithVAT invoiceWithVAT = new InvoiceWithVAT(invoice);
        InvoiceWithService invoiceWithService = new InvoiceWithService(invoiceWithVAT);
        return invoiceWithService.getPrice();
    }
}
