package Command.Crypto.handlers;

import Command.Crypto.CryptoCurrency;
import Command.Crypto.commands.BuyCommand;
import Command.Crypto.commands.SellCommand;

public class CryptoHandler {
    public void sell(SellCommand command, CryptoCurrency cryptoCurrency) {
        System.out.println("Buying " + cryptoCurrency.getAmount() + " of " + cryptoCurrency.getAmount());
    }

    public void buy(BuyCommand command, CryptoCurrency cryptoCurrency) {
        System.out.println("Buying " + cryptoCurrency.getAmount() + " of " + cryptoCurrency.getAmount());
    }
}
