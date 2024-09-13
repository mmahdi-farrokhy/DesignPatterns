package org.example.bridge.survey.presentations;

import org.example.bridge.survey.Presentation;

public class SeparatedPage implements Presentation {
    @Override
    public String show() {
        return "Show a question in another page and wait for the answer";
    }
}
