package Command.Crypto.commands;

import Command.Crypto.CryptoCurrency;
import Command.Crypto.handlers.CryptoHandler;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SellCommand implements CryptoCommand {
    private final CryptoHandler handler;

    @Override
    public void execute(CryptoCurrency cryptoCurrency) {
        handler.sell(this, cryptoCurrency);
    }
}
