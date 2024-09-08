package org.example.abstract_factory.document.documents.html;

import org.example.abstract_factory.document.Body;

public class HTMLBody implements Body {
    @Override
    public String generate() {
        return "HTML Body";
    }
}
