package FactoryMethod.Notification.creators;

import FactoryMethod.Notification.Notifier;
import FactoryMethod.Notification.NotifierCreator;
import FactoryMethod.Notification.notifiers.TelegramNotifier;

public class TelegramNotifierCreator extends NotifierCreator {
    @Override
    public Notifier createNotifier() {
        return new TelegramNotifier();
    }
}
