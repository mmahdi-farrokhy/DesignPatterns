package ChainOfResponsibility.Product.verifiers;

import ChainOfResponsibility.Product.Product;
import ChainOfResponsibility.Product.Subscription;
import ChainOfResponsibility.Product.User;
import ChainOfResponsibility.Product.Verifier;

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
