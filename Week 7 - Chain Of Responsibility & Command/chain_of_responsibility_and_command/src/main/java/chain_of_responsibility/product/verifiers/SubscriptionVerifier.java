package chain_of_responsibility.product.verifiers;

import chain_of_responsibility.product.Product;
import chain_of_responsibility.product.Subscription;
import chain_of_responsibility.product.User;
import chain_of_responsibility.product.Verifier;

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
