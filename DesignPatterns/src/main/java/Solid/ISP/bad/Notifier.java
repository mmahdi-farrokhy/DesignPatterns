package Solid.ISP.bad;

public interface Notifier {
    void sendSMS(String message);

    void sendEmail(String message);

    void sendPushNotification(String message);
}
