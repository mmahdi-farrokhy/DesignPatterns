package org.example.abstract_factory.document.documents.pdf;

import org.example.abstract_factory.document.Body;
import org.example.abstract_factory.document.DocumentFactory;
import org.example.abstract_factory.document.Footer;
import org.example.abstract_factory.document.Header;

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
