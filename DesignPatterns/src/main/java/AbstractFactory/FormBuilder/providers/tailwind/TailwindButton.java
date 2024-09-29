package AbstractFactory.FormBuilder.providers.tailwind;

import AbstractFactory.FormBuilder.elements.Button;

public class TailwindButton implements Button {
    @Override
    public String render() {
        return "<button class=\"bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded\">Button</button>";
    }
}
