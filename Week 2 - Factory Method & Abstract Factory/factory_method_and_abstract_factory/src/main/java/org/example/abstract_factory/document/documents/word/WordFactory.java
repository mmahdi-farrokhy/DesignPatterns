package org.example.abstract_factory.document.documents.word;

import org.example.abstract_factory.document.Body;
import org.example.abstract_factory.document.DocumentFactory;
import org.example.abstract_factory.document.Footer;
import org.example.abstract_factory.document.Header;

public class WordFactory implements DocumentFactory {
    @Override
    public Header createHeader() {
        return new WordHeader();
    }

    @Override
    public Body createBody() {
        return new WordBody();
    }

    @Override
    public Footer createFooter() {
        return new WordFooter();
    }
}
