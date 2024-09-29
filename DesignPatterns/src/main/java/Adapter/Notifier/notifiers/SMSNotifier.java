package Adapter.Notifier.notifiers;

import Adapter.Notifier.Notifier;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SMSNotifier implements Notifier {
    private String phoneNumber;

    @Override
    public void send(String message) {
        System.out.println("Sending SMS to: " + phoneNumber + ": " + message);
    }
}
