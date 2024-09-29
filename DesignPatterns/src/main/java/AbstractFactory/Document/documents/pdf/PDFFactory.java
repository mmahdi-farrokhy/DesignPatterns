package AbstractFactory.Document.documents.pdf;

import AbstractFactory.Document.Body;
import AbstractFactory.Document.DocumentFactory;
import AbstractFactory.Document.Footer;
import AbstractFactory.Document.Header;

public class PDFFactory implements DocumentFactory {
    @Override
    public Header createHeader() {
        return new PDFHeader();
    }

    @Override
    public Body createBody() {
        return new PDFBody();
    }

    @Override
    public Footer createFooter() {
        return new PDFFooter();
    }
}
