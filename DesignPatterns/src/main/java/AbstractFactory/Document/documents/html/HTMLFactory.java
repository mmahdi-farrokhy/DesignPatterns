package AbstractFactory.Document.documents.html;

import AbstractFactory.Document.Body;
import AbstractFactory.Document.DocumentFactory;
import AbstractFactory.Document.Footer;
import AbstractFactory.Document.Header;

public class HTMLFactory implements DocumentFactory {
    @Override
    public Header createHeader() {
        return new HTMLHeader();
    }

    @Override
    public Body createBody() {
        return new HTMLBody();
    }

    @Override
    public Footer createFooter() {
        return new HTMLFooter();
    }
}
