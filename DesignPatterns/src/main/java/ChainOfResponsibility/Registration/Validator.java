package ChainOfResponsibility.Registration;

public abstract class Validator {
    private Validator nextValidator;

    public Validator(Validator nextValidator) {
        this.nextValidator = nextValidator;
    }

    public boolean validate(RegistrationRequest request) {
        if (nextValidator == null) {
            return true;
        }

        return nextValidator.validate(request);
    }
}
