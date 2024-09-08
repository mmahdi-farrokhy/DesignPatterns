package org.example.abstract_factory.document.documents.pdf;

import org.example.abstract_factory.document.Footer;

public class PDFFooter implements Footer {
    @Override
    public String generate() {
        return "PDF Footer";
    }
}
