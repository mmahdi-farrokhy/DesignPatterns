package Adapter.Notifier.notifiers;

import Adapter.Notifier.Notifier;

public class SMSNotifier implements Notifier {
    private String phoneNumber;

    public SMSNotifier(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void send(String message) {
        System.out.println("Sending SMS to: " + phoneNumber + ": " + message);
    }
}
