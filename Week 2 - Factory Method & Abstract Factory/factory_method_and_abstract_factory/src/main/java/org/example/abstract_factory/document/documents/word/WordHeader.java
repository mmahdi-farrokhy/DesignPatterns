package org.example.abstract_factory.document.documents.word;

import org.example.abstract_factory.document.Header;

public class WordHeader implements Header {
    @Override
    public String generate() {
        return "Word Header";
    }
}
