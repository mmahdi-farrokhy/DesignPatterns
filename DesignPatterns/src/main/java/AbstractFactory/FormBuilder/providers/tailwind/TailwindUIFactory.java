package AbstractFactory.FormBuilder.providers.tailwind;

import AbstractFactory.FormBuilder.FormUIFactory;
import AbstractFactory.FormBuilder.elements.Button;
import AbstractFactory.FormBuilder.elements.TextArea;
import AbstractFactory.FormBuilder.elements.TextInput;
import AbstractFactory.FormBuilder.providers.bootstrap.BootstrapTextArea;

public class TailwindUIFactory implements FormUIFactory {
    @Override
    public TextArea createTextArea() {
        return new BootstrapTextArea();
    }

    @Override
    public Button createButton() {
        return new TailwindButton();
    }

    @Override
    public TextInput createTextInput() {
        return new TailwindTextInput();
    }
}
