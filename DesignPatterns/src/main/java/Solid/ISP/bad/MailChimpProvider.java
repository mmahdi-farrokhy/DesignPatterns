package Solid.ISP.bad;

public class MailChimpProvider implements Notifier {
    @Override
    public void sendSMS(String message) {
        System.out.println("Sending SMS to Iran: " + message);
    }

    @Override
    public void sendEmail(String message) {
        System.out.println("Sending Email to Iran: " + message);
    }

    @Override
    public void sendPushNotification(String message) {
        System.out.println("Sending Push Notification to Iran: " + message);
    }
}
