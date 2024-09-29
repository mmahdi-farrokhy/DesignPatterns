package Observer.Order;

import Observer.Contracts.Observer;
import Observer.Contracts.ObserverStorage;
import Observer.Contracts.Subject;
import lombok.AllArgsConstructor;

public class Order implements Subject {
    private final ObserverStorage observerStorage;
    private OrderStatus status;

    public Order() {
        this.observerStorage = new ObserverStorage();
        this.status = OrderStatus.PENDING;
    }

    public void process() {
        status = OrderStatus.PROCESSING;
        notifySubscriber();
    }

    public OrderStatus getStatus() {
        return status;
    }

    @Override
    public void attach(String name, Observer observer) {

    }

    @Override
    public void detach(Observer observer, String name) {

    }

    @Override
    public void notifySubscriber() {
        observerStorage.getObservers()
                .values()
                .forEach(observer -> observer.update(this));
    }
}
