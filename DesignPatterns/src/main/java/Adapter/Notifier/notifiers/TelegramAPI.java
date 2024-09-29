package Adapter.Notifier.notifiers;

public class TelegramAPI { // third party package
    public void sendMessage(String chatID, String message) {
        System.out.println("Sending message " + message + " to chat " + chatID);
    }
}
