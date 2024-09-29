package AbstractFactory.Document.documents.html;

import AbstractFactory.Document.Body;

public class HTMLBody implements Body {
    @Override
    public String generate() {
        return "HTML Body";
    }
}
