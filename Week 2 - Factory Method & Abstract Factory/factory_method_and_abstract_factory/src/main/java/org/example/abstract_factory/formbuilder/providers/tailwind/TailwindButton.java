package org.example.abstract_factory.formbuilder.providers.tailwind;

import org.example.abstract_factory.formbuilder.elements.Button;

public class TailwindButton implements Button {
    @Override
    public String render() {
        return "<button class=\"bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded\">Button</button>";
    }
}
