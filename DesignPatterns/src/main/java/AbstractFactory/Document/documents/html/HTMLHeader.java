package AbstractFactory.Document.documents.html;

import AbstractFactory.Document.Header;

public class HTMLHeader implements Header {
    @Override
    public String generate() {
        return "HTML Header";
    }
}
