package chain_of_responsibility.product.verifiers;

import chain_of_responsibility.product.Product;
import chain_of_responsibility.product.Subscription;
import chain_of_responsibility.product.User;
import chain_of_responsibility.product.Verifier;

public class ActivationVerifier extends Verifier {
    public ActivationVerifier(Verifier verifier) {
        super(verifier);
    }

    @Override
    public boolean verify(User user, Product product) {
        Subscription byUserAndProduct = Subscription.findByUserAndProduct(user, product);
        if (!byUserAndProduct.isActivated(user.getUsername())) {
            return false;
        }

        return super.verify(user, product);
    }
}
