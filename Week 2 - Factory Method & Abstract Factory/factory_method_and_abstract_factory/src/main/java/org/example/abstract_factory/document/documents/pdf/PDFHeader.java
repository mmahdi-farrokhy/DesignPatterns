package org.example.abstract_factory.document.documents.pdf;

import org.example.abstract_factory.document.Header;

public class PDFHeader implements Header {
    @Override
    public String generate() {
        return "PDF Header";
    }
}
