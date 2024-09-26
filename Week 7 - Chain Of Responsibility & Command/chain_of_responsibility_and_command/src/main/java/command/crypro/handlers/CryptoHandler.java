package command.crypro.handlers;

import command.crypro.CryptoCurrency;
import command.crypro.commands.BuyCommand;
import command.crypro.commands.SellCommand;

public class CryptoHandler {
    public void sell(SellCommand command, CryptoCurrency cryptoCurrency) {
        System.out.println("Buying " + cryptoCurrency.getAmount() + " of " + cryptoCurrency.getAmount());
    }

    public void buy(BuyCommand command, CryptoCurrency cryptoCurrency) {
        System.out.println("Buying " + cryptoCurrency.getAmount() + " of " + cryptoCurrency.getAmount());
    }
}
