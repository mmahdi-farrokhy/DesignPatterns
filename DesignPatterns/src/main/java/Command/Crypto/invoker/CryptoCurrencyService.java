package Command.Crypto.invoker;

import Command.Crypto.CryptoCurrency;
import Command.Crypto.commands.CryptoCommand;

public class CryptoCurrencyService {
    private CryptoCommand command;

    public CryptoCurrencyService(CryptoCommand command) {
        this.command = command;
    }

    public void setCommand(CryptoCommand command) {
        this.command = command;
    }

    public void sell(CryptoCurrency cryptoCurrency) {
        command.execute(cryptoCurrency);
    }

    public void remove(CryptoCurrency cryptoCurrency) {
        command.execute(cryptoCurrency);
    }
}
