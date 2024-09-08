package org.example.abstract_factory.formbuilder.providers.tailwind;

import org.example.abstract_factory.formbuilder.elements.TextInput;

public class TailwindTextArea implements TextInput {
    @Override
    public String render() {
        return "<textarea class=\"bg-gray-200 appearance-none border-2 border-gray-200 w-full py-2 px-4 rounded\">Button</textarea>";
    }
}
