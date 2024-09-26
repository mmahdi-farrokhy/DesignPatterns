package command.crypro.commands;

import command.crypro.CryptoCurrency;

public interface CryptoCommand {
    void execute(CryptoCurrency cryptoCurrency);
}
