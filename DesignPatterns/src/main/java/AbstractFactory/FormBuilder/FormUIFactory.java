package AbstractFactory.FormBuilder;

import AbstractFactory.FormBuilder.elements.Button;
import AbstractFactory.FormBuilder.elements.TextArea;
import AbstractFactory.FormBuilder.elements.TextInput;

public interface FormUIFactory {
    TextArea createTextArea();

    Button createButton();

    TextInput createTextInput();
}
