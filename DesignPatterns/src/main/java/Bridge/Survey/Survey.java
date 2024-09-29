package Bridge.Survey;

public abstract class Survey {
    protected Presentation presentation;

    public Survey(Presentation presentation) {
        this.presentation = presentation;
    }

    protected abstract String display();
}
