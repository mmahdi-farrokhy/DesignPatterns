package org.example.abstract_factory.formbuilder.providers.bootstrap;

import org.example.abstract_factory.formbuilder.elements.TextArea;
import org.example.abstract_factory.formbuilder.elements.TextInput;

public class BootstrapTextArea implements TextArea {
    @Override
    public String render() {
        return "<textarea class=\"form-control\">Button</textarea>";
    }
}
