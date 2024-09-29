package AbstractFactory.Document.documents.pdf;

import AbstractFactory.Document.Body;

public class PDFBody implements Body {
    @Override
    public String generate() {
        return "PDF Body";
    }
}
