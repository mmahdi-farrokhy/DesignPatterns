package ChainOfResponsibility.Product.verifiers;

import ChainOfResponsibility.Product.Product;
import ChainOfResponsibility.Product.Subscription;
import ChainOfResponsibility.Product.User;
import ChainOfResponsibility.Product.Verifier;

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
