package Command.Crypto.commands;

import Command.Crypto.CryptoCurrency;
import Command.Crypto.handlers.CryptoHandler;

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
