package Observer.Contracts;

public interface Subject {
    public void attach(String name, Observer observer);

    public void detach(Observer observer, String name);

    public void notifySubscriber();
}
