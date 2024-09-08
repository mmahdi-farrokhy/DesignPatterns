package org.example.abstract_factory.document;

public interface DocumentFactory {
    Header createHeader();

    Body createBody();

    Footer createFooter();
}
