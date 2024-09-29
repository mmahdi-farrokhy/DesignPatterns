package Command.Crypto.commands;

import Command.Crypto.CryptoCurrency;
import Command.Crypto.handlers.CryptoHandler;

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
