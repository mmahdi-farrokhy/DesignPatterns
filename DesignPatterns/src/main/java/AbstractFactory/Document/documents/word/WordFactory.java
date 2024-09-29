package AbstractFactory.Document.documents.word;

import AbstractFactory.Document.Body;
import AbstractFactory.Document.DocumentFactory;
import AbstractFactory.Document.Footer;
import AbstractFactory.Document.Header;

public class WordFactory implements DocumentFactory {
    @Override
    public Header createHeader() {
        return new WordHeader();
    }

    @Override
    public Body createBody() {
        return new WordBody();
    }

    @Override
    public Footer createFooter() {
        return new WordFooter();
    }
}
