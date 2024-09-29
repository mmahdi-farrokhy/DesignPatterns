package FactoryMethod.Notification.creators;

import FactoryMethod.Notification.Notifier;
import FactoryMethod.Notification.NotifierCreator;
import FactoryMethod.Notification.notifiers.SMSNotifier;

public class SMSNotifierCreator extends NotifierCreator {
    @Override
    public Notifier createNotifier() {
        return new SMSNotifier();
    }
}
