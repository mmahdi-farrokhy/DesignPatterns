package AbstractFactory.FormBuilder.providers.bootstrap;

import AbstractFactory.FormBuilder.elements.Button;

public class BootstrapButton implements Button {
    @Override
    public String render() {
        return "<button class=\"btn btn-primary\">Button</button>";
    }
}
