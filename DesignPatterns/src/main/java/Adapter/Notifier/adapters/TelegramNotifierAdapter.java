package Adapter.Notifier.adapters;

import Adapter.Notifier.Notifier;
import Adapter.Notifier.notifiers.TelegramAPI;

public class TelegramNotifierAdapter implements Notifier {
    private TelegramAPI telegramAPI;
    private String chatID;

    public TelegramNotifierAdapter(TelegramAPI telegramAPI, String chatID) {
        this.telegramAPI = telegramAPI;
        this.chatID = chatID;
    }

    @Override
    public void send(String message) {
        telegramAPI.sendMessage(chatID, message);
    }
}
