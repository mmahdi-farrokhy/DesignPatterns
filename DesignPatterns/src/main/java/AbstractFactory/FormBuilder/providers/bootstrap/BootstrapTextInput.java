package AbstractFactory.FormBuilder.providers.bootstrap;

import AbstractFactory.FormBuilder.elements.TextInput;

public class BootstrapTextInput implements TextInput {
    @Override
    public String render() {
        return "<input type=\"text\" class=\"form-control\">";
    }
}
