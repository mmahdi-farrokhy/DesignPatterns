package FactoryMethod.Notification.notifiers;

import FactoryMethod.Notification.Alert;
import FactoryMethod.Notification.Notifier;

public class TelegramNotifier implements Notifier {
    @Override
    public void notify(Alert alert) {
        System.out.println("TelegramNotifier alert");
    }
}
