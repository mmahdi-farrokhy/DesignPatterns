package org.example.abstract_factory.document.documents.html;

import org.example.abstract_factory.document.Body;
import org.example.abstract_factory.document.DocumentFactory;
import org.example.abstract_factory.document.Footer;
import org.example.abstract_factory.document.Header;

public class HTMLFactory implements DocumentFactory {
    @Override
    public Header createHeader() {
        return new HTMLHeader();
    }

    @Override
    public Body createBody() {
        return new HTMLBody();
    }

    @Override
    public Footer createFooter() {
        return new HTMLFooter();
    }
}
