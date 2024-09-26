package command.crypro.commands;

import command.crypro.CryptoCurrency;
import command.crypro.handlers.CryptoHandler;

public class BuyCommand implements CryptoCommand {
    private final CryptoHandler handler;

    public BuyCommand(CryptoHandler handler) {
        this.handler = handler;
    }

    @Override
    public void execute(CryptoCurrency cryptoCurrency) {
        handler.buy(this, cryptoCurrency);
    }
}
