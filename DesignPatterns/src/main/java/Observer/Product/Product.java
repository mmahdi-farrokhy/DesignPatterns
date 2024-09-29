package Observer.Product;

import Observer.Contracts.Observer;
import Observer.Contracts.ObserverStorage;
import Observer.Contracts.Subject;

public class Product implements Subject {
    private double price;
    private final ObserverStorage observerStorage;

    public Product(double price) {
        this.price = price;
        this.observerStorage = new ObserverStorage();
    }

    public void changePrice(double price) {
        if (price == this.price) {
            return;
        }

        if (price < 0) {
            throw new Error("Price can not be negative");
        }

        this.price = price;
        notifySubscriber();
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void attach(String name, Observer observer) {
        observerStorage.attach(name, observer);
    }

    @Override
    public void detach(Observer observer, String name) {
        observerStorage.detach(name);
    }

    @Override
    public void notifySubscriber() {
        observerStorage.getObservers()
                .values()
                .forEach(
                        observer -> observer.update(this));
    }
}
