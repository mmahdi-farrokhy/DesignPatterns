package org.example.abstract_factory.document.documents.pdf;

import org.example.abstract_factory.document.Body;

public class PDFBody implements Body {
    @Override
    public String generate() {
        return "PDF Body";
    }
}
