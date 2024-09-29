package ChainOfResponsibility.Product;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class Verifier {
    private final Verifier nextVerifier;

    public boolean verify(User user, Product product) {
        if (nextVerifier == null) {
            return true;
        }

        return nextVerifier.verify(user, product);
    }
}
