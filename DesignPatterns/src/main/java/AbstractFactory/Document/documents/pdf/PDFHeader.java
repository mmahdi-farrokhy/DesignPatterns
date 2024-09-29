package AbstractFactory.Document.documents.pdf;

import AbstractFactory.Document.Header;

public class PDFHeader implements Header {
    @Override
    public String generate() {
        return "PDF Header";
    }
}
