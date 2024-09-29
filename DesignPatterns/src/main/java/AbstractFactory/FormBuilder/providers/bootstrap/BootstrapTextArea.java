package AbstractFactory.FormBuilder.providers.bootstrap;

import AbstractFactory.FormBuilder.elements.TextArea;

public class BootstrapTextArea implements TextArea {
    @Override
    public String render() {
        return "<textarea class=\"form-control\">Button</textarea>";
    }
}
