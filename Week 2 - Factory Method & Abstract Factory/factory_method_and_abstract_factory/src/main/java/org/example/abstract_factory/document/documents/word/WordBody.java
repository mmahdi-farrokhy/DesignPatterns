package org.example.abstract_factory.document.documents.word;

import org.example.abstract_factory.document.Body;

public class WordBody implements Body {
    @Override
    public String generate() {
        return "Word Body";
    }
}
