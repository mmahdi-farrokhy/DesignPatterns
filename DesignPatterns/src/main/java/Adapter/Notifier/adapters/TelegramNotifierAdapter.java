package Adapter.Notifier.adapters;

import Adapter.Notifier.Notifier;
import Adapter.Notifier.notifiers.TelegramAPI;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TelegramNotifierAdapter implements Notifier {
    private TelegramAPI telegramAPI;
    private String chatID;

    @Override
    public void send(String message) {
        telegramAPI.sendMessage(chatID, message);
    }
}
