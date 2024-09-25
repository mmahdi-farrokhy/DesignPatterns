package chain_of_responsibility.product.verifiers;

import chain_of_responsibility.product.Product;
import chain_of_responsibility.product.Subscription;
import chain_of_responsibility.product.User;
import chain_of_responsibility.product.Verifier;

public class ExpirationVerifier extends Verifier {
    public ExpirationVerifier(Verifier verifier) {
        super(verifier);
    }

    @Override
    public boolean verify(User user, Product product) {
        Subscription byUserAndProduct = Subscription.findByUserAndProduct(user, product);
        if (byUserAndProduct.isExpired()) {
            return false;
        }

        return super.verify(user, product);
    }
}
