package AbstractFactory.Document;

public interface DocumentFactory {
    Header createHeader();

    Body createBody();

    Footer createFooter();
}
