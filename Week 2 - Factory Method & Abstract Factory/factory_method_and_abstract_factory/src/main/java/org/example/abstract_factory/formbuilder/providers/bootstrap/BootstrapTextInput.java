package org.example.abstract_factory.formbuilder.providers.bootstrap;

import org.example.abstract_factory.formbuilder.elements.TextInput;

public class BootstrapTextInput implements TextInput {
    @Override
    public String render() {
        return "<input type=\"text\" class=\"form-control\">";
    }
}
