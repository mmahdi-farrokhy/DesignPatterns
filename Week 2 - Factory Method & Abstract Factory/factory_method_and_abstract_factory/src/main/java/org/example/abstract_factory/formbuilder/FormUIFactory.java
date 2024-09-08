package org.example.abstract_factory.formbuilder;

import org.example.abstract_factory.formbuilder.elements.Button;
import org.example.abstract_factory.formbuilder.elements.TextArea;
import org.example.abstract_factory.formbuilder.elements.TextInput;

public interface FormUIFactory {
    TextArea createTextArea();

    Button createButton();

    TextInput createTextInput();
}
