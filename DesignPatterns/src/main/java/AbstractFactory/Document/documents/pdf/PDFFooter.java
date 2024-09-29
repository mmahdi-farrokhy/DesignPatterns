package AbstractFactory.Document.documents.pdf;

import AbstractFactory.Document.Footer;

public class PDFFooter implements Footer {
    @Override
    public String generate() {
        return "PDF Footer";
    }
}
