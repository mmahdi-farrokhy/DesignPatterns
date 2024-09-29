package Observer.Contracts;

import java.util.HashMap;
import java.util.Map;

public class ObserverStorage {
    private Map<String, Observer> observers = new HashMap<>();

    public void attach(String name, Observer observer) {
        this.observers.put(name, observer);
    }

    public void detach(String name) {
        this.observers.remove(name);
    }

    public Map<String, Observer> getObservers() {
        return observers;
    }
}
