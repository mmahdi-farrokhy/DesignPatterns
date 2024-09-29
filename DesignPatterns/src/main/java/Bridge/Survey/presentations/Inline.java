package Bridge.Survey.presentations;

import Bridge.Survey.Presentation;

public class Inline implements Presentation {
    @Override
    public String show() {
        return "Show a question with text field for answer";
    }
}
