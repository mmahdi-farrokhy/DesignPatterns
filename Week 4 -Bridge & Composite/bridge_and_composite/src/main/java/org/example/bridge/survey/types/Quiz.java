package org.example.bridge.survey.types;

import org.example.bridge.survey.Presentation;
import org.example.bridge.survey.Survey;

public class Quiz extends Survey {
    public Quiz(Presentation presentation) {
        super(presentation);
    }

    @Override
    protected String display() {
        return presentation.show();
    }
}
