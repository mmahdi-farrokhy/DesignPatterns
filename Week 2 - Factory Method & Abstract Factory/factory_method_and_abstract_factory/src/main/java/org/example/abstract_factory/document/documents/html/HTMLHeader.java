package org.example.abstract_factory.document.documents.html;

import org.example.abstract_factory.document.Header;

public class HTMLHeader implements Header {
    @Override
    public String generate() {
        return "HTML Header";
    }
}
