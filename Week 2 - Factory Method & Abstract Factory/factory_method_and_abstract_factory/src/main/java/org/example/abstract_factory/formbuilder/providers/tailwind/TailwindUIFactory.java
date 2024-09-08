package org.example.abstract_factory.formbuilder.providers.tailwind;

import org.example.abstract_factory.formbuilder.FormUIFactory;
import org.example.abstract_factory.formbuilder.elements.Button;
import org.example.abstract_factory.formbuilder.elements.TextArea;
import org.example.abstract_factory.formbuilder.elements.TextInput;
import org.example.abstract_factory.formbuilder.providers.bootstrap.BootstrapTextArea;

public class TailwindUIFactory implements FormUIFactory {
    @Override
    public TextArea createTextArea() {
        return new BootstrapTextArea();
    }

    @Override
    public Button createButton() {
        return new TailwindButton();
    }

    @Override
    public TextInput createTextInput() {
        return new TailwindTextInput();
    }
}
