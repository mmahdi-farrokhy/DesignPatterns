package Bridge.Survey.presentations;

import Bridge.Survey.Presentation;

public class SeparatedPage implements Presentation {
    @Override
    public String show() {
        return "Show a question in another page and wait for the answer";
    }
}
