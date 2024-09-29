package ChainOfResponsibility.Registration;

import ChainOfResponsibility.Registration.validators.EmailValidator;
import ChainOfResponsibility.Registration.validators.PasswordValidator;
import ChainOfResponsibility.Registration.validators.ReferralValidator;

public class Registration {

    public boolean validate(RegistrationRequest request) {
        return buildValidationChain().validate(request);
    }

    private Validator buildValidationChain() {
        EmailValidator emailValidator = new EmailValidator(null);
        PasswordValidator passwordValidator = new PasswordValidator(emailValidator);
        return new ReferralValidator(passwordValidator);
    }
}
