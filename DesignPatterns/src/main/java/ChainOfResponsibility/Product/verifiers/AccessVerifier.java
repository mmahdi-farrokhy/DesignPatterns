package ChainOfResponsibility.Product.verifiers;

import ChainOfResponsibility.Product.Product;
import ChainOfResponsibility.Product.User;
import ChainOfResponsibility.Product.Verifier;

public class AccessVerifier {

    public boolean verify(User user, Product product) {
        return buildVerificationChain().verify(user, product);
    }

    private Verifier buildVerificationChain() {
        ActivationVerifier activationVerifier = new ActivationVerifier(null);// 3rd chain link
        ExpirationVerifier expirationVerifier = new ExpirationVerifier(activationVerifier); // 2nd chain link
        return new SubscriptionVerifier(expirationVerifier); // 1st chain link
    }
}
