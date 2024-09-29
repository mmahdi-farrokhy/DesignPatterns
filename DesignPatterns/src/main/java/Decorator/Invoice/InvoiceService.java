package Decorator.Invoice;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class InvoiceService {
    @NonNull
    private InvoicePrice invoicePrice;
    @NonNull
    private Invoice invoice;

    public double getInvoicePrice() {
        return invoicePrice.getPrice();
    }

    public double getDecoratedPrice() {
        InvoiceWithVAT invoiceWithVAT = new InvoiceWithVAT(invoice);
        InvoiceWithService invoiceWithService = new InvoiceWithService(invoiceWithVAT);
        return invoiceWithService.getPrice();
    }
}
