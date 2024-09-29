package AbstractFactory.Document;

public class DocumentService {
    private final DocumentFactory documentFactory;

    public DocumentService(DocumentFactory documentFactory) {
        this.documentFactory = documentFactory;
    }

    public String createDocument() {
        return documentFactory.createHeader().generate() +
                documentFactory.createBody().generate() +
                documentFactory.createFooter().generate();
    }
}
