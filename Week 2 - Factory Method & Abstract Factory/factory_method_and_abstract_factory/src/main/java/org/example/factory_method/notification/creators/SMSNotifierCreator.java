package org.example.factory_method.notification.creators;

import org.example.factory_method.notification.notifiers.SMSNotifier;
import org.example.factory_method.notification.Notifier;
import org.example.factory_method.notification.NotifierCreator;

public class SMSNotifierCreator extends NotifierCreator {
    @Override
    public Notifier createNotifier() {
        return new SMSNotifier();
    }
}
