package ChainOfResponsibility.Product.verifiers;

import ChainOfResponsibility.Product.Product;
import ChainOfResponsibility.Product.Subscription;
import ChainOfResponsibility.Product.User;
import ChainOfResponsibility.Product.Verifier;

public class SubscriptionVerifier extends Verifier {
    public SubscriptionVerifier(Verifier verifier) {
        super(verifier);
    }

    @Override
    public boolean verify(User user, Product product) {
        if (Subscription.findByUserAndProduct(user, product) == null) {
            return false;
        }

        return super.verify(user, product);
    }
}
