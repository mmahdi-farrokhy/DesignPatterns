package org.example.bridge.survey.presentations;

import org.example.bridge.survey.Presentation;

public class Inline implements Presentation {
    @Override
    public String show() {
        return "Show a question with text field for answer";
    }
}
