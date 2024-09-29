package Command.Crypto.invoker;

import Command.Crypto.CryptoCurrency;
import Command.Crypto.commands.CryptoCommand;
import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
public class CryptoCurrencyService {
    private CryptoCommand command;

    public void sell(CryptoCurrency cryptoCurrency) {
        command.execute(cryptoCurrency);
    }

    public void remove(CryptoCurrency cryptoCurrency) {
        command.execute(cryptoCurrency);
    }
}
