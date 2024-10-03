package Mediator.EventDispatcher;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventDispatcher {
    private Map<String, List<Observer>> observers = new HashMap<>();

    public void attach(String event, Observer observer) {
        if (!observers.containsKey(event)) {
            observers.put(event, List.of());
        }

        if (observers.get(event) == null) {
            return;
        }

        observers.get(event).add(observer);
    }

    public void detach(String event, Observer observer) {
        if (observers.containsKey(event)) {
            List<Observer> observers = this.observers.get(event);
            if (observers == null) {
                return;
            }

            int index = observers.indexOf(observer);
            if (index > -1) {
                observers.remove(index);
            }
        }
    }

    public void fire(String event, Object emitter, Object data) {
        if (observers.containsKey(event)) {
            List<Observer> observers1 = observers.get(event);
            if (observers1 == null) {
                return;
            }

            observers1.forEach(observer -> observer.update(event, emitter, data));
        }
    }
}
