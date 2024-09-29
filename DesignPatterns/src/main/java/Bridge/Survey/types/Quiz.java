package Bridge.Survey.types;

import Bridge.Survey.Presentation;
import Bridge.Survey.Survey;

public class Quiz extends Survey {
    public Quiz(Presentation presentation) {
        super(presentation);
    }

    @Override
    protected String display() {
        return presentation.show();
    }
}
