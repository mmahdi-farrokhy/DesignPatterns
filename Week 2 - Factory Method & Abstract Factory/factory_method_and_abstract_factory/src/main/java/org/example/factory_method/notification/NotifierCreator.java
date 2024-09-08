package org.example.factory_method.notification;

public abstract class NotifierCreator {
    public abstract Notifier createNotifier();

    public void notify(Alert alert) {
        Notifier notifier = createNotifier();
        notifier.notify(alert);
    }
}
