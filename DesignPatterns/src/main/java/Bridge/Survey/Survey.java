package Bridge.Survey;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Survey {
    protected Presentation presentation;

    protected abstract String display();
}
