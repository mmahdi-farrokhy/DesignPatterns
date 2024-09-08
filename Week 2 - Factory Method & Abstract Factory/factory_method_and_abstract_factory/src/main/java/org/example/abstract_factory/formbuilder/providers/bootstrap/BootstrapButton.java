package org.example.abstract_factory.formbuilder.providers.bootstrap;

import org.example.abstract_factory.formbuilder.elements.Button;

public class BootstrapButton implements Button {
    @Override
    public String render() {
        return "<button class=\"btn btn-primary\">Button</button>";
    }
}
