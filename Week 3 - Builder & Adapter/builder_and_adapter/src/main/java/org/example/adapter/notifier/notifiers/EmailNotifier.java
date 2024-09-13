package org.example.adapter.notifier.notifiers;

import org.example.adapter.notifier.Notifier;

public class EmailNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }
}
