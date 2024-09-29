package Command.Crypto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CryptoCurrency {
    private final CryptoUnit unit;
    private final double amount;
}
