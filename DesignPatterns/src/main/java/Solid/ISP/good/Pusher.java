package Solid.ISP.good;

public class Pusher implements PushProvider {

    @Override
    public void sendPushNotification(String message) {
        System.out.println("Sending Push Notification to Iran: " + message);
    }
}
