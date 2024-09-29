package Bridge.Survey.types;

import Bridge.Survey.Presentation;
import Bridge.Survey.Survey;

public class PaymentForm extends Survey {
    public PaymentForm(Presentation presentation) {
        super(presentation);
    }

    @Override
    protected String display() {
        return presentation.show();
    }
}
