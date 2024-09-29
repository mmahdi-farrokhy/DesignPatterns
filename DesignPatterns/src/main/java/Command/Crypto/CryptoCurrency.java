package Command.Crypto;

public class CryptoCurrency {
    private final CryptoUnit unit;
    private final double amount;

    public CryptoCurrency(CryptoUnit unit, double amount) {
        this.unit = unit;
        this.amount = amount;
    }

    public CryptoUnit getUnit() {
        return unit;
    }

    public double getAmount() {
        return amount;
    }
}
