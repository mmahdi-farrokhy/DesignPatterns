package org.example.abstract_factory.formbuilder.providers.bootstrap;

import org.example.abstract_factory.formbuilder.FormUIFactory;
import org.example.abstract_factory.formbuilder.elements.Button;
import org.example.abstract_factory.formbuilder.elements.TextArea;
import org.example.abstract_factory.formbuilder.elements.TextInput;

public class BootstrapUIFactory implements FormUIFactory {
    @Override
    public TextArea createTextArea() {
        return new BootstrapTextArea();
    }

    @Override
    public Button createButton() {
        return new BootstrapButton();
    }

    @Override
    public TextInput createTextInput() {
        return new BootstrapTextInput();
    }
}
