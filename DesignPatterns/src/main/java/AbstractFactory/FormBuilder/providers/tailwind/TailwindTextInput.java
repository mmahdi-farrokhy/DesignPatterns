package AbstractFactory.FormBuilder.providers.tailwind;

import AbstractFactory.FormBuilder.elements.TextInput;

public class TailwindTextInput implements TextInput {
    @Override
    public String render() {
        return "<input type=\"text\" class=\"form-control\"/>";
    }
}
