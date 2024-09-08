package org.example.abstract_factory.document.documents.html;

import org.example.abstract_factory.document.Footer;

public class HTMLFooter implements Footer {
    @Override
    public String generate() {
        return "HTML Footer";
    }
}
