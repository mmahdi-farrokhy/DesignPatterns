package Bridge.Survey.presentations;

import Bridge.Survey.Presentation;

public class Popup implements Presentation {
    @Override
    public String show() {
        return "Show a popup windows and a text field for answer, with a submit button";
    }
}
