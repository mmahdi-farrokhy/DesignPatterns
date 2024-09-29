package Command.Crypto.commands;

import Command.Crypto.CryptoCurrency;
import Command.Crypto.handlers.CryptoHandler;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BuyCommand implements CryptoCommand {
    private final CryptoHandler handler;

    @Override
    public void execute(CryptoCurrency cryptoCurrency) {
        handler.buy(this, cryptoCurrency);
    }
}
