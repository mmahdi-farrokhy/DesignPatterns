package Command.Crypto.commands;

import Command.Crypto.CryptoCurrency;

public interface CryptoCommand {
    void execute(CryptoCurrency cryptoCurrency);
}
