package org.example.abstract_factory.document.documents.word;

import org.example.abstract_factory.document.Footer;

public class WordFooter implements Footer {
    @Override
    public String generate() {
        return "Word Footer";
    }
}
