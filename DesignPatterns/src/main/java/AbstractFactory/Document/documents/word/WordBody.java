package AbstractFactory.Document.documents.word;

import AbstractFactory.Document.Body;

public class WordBody implements Body {
    @Override
    public String generate() {
        return "Word Body";
    }
}
