package org.example.abstract_factory.formbuilder;

public class FormService {
    private final FormUIFactory formUIFactory;

    public FormService(FormUIFactory formUIFactory) {
        this.formUIFactory = formUIFactory;
    }

    public String buildForm() {
        return
                "<form>\n" +
                        formUIFactory.createTextInput().render() + "\n" +
                        formUIFactory.createTextArea().render() + "\n" +
                        formUIFactory.createButton().render() + "\n" +
                        "<form>"
                ;
    }
}
