package org.example.factory_method.notification.notifiers;

import org.example.factory_method.notification.Alert;
import org.example.factory_method.notification.Notifier;

public class SlackNotifier implements Notifier {
    @Override
    public void notify(Alert alert) {
        System.out.println("SlackNotifier alert");
    }
}
