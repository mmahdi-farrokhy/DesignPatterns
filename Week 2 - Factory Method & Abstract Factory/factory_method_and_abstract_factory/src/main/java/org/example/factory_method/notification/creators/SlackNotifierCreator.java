package org.example.factory_method.notification.creators;

import org.example.factory_method.notification.notifiers.TelegramNotifier;
import org.example.factory_method.notification.Notifier;
import org.example.factory_method.notification.NotifierCreator;

public class SlackNotifierCreator extends NotifierCreator {
    @Override
    public Notifier createNotifier() {
        return new TelegramNotifier();
    }
}
