package org.example.abstract_factory.formbuilder.providers.tailwind;

import org.example.abstract_factory.formbuilder.elements.TextInput;

public class TailwindTextInput implements TextInput {
    @Override
    public String render() {
        return "<input type=\"text\" class=\"form-control\"/>";
    }
}
