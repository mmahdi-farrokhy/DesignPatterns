package AbstractFactory.FormBuilder.providers.bootstrap;

import AbstractFactory.FormBuilder.FormUIFactory;
import AbstractFactory.FormBuilder.elements.Button;
import AbstractFactory.FormBuilder.elements.TextArea;
import AbstractFactory.FormBuilder.elements.TextInput;

public class BootstrapUIFactory implements FormUIFactory {
    @Override
    public TextArea createTextArea() {
        return new BootstrapTextArea();
    }

    @Override
    public Button createButton() {
        return new BootstrapButton();
    }

    @Override
    public TextInput createTextInput() {
        return new BootstrapTextInput();
    }
}
