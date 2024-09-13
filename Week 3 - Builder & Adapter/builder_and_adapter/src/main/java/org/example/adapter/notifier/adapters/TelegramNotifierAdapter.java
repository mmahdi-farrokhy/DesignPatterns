package org.example.adapter.notifier.adapters;

import org.example.adapter.notifier.Notifier;
import org.example.adapter.notifier.notifiers.TelegramAPI;

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
