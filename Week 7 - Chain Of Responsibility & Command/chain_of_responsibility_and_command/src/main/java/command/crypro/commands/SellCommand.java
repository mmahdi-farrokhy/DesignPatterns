package command.crypro.commands;

import command.crypro.CryptoCurrency;
import command.crypro.handlers.CryptoHandler;

public class SellCommand implements CryptoCommand {
    private final CryptoHandler handler;

    public SellCommand(CryptoHandler handler) {
        this.handler = handler;
    }

    @Override
    public void execute(CryptoCurrency cryptoCurrency) {
        handler.sell(this, cryptoCurrency);
    }
}
