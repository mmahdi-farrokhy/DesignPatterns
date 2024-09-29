package AbstractFactory.Document.documents.word;

import AbstractFactory.Document.Footer;

public class WordFooter implements Footer {
    @Override
    public String generate() {
        return "Word Footer";
    }
}
