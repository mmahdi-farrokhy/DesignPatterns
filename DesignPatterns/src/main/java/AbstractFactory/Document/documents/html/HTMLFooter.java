package AbstractFactory.Document.documents.html;

import AbstractFactory.Document.Footer;

public class HTMLFooter implements Footer {
    @Override
    public String generate() {
        return "HTML Footer";
    }
}
