package chain_of_responsibility.registration;

import chain_of_responsibility.registration.validators.EmailValidator;
import chain_of_responsibility.registration.validators.PasswordValidator;
import chain_of_responsibility.registration.validators.ReferralValidator;

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
