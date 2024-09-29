package AbstractFactory.Document.documents.word;

import AbstractFactory.Document.Header;

public class WordHeader implements Header {
    @Override
    public String generate() {
        return "Word Header";
    }
}
