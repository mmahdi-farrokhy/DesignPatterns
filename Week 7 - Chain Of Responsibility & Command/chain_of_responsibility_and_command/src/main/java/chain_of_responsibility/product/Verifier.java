package chain_of_responsibility.product;

public abstract class Verifier {
    private final Verifier nextVerifier;

    public Verifier(Verifier verifier) {
        this.nextVerifier = verifier;
    }

    public Verifier getNextVerifier() {
        return nextVerifier;
    }

    public boolean verify(User user, Product product) {
        if (nextVerifier == null) {
            return true;
        }

        return nextVerifier.verify(user, product);
    }
}
