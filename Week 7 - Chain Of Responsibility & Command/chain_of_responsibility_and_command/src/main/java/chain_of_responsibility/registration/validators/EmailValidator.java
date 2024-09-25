package chain_of_responsibility.registration.validators;

import chain_of_responsibility.registration.Validator;
import chain_of_responsibility.registration.RegistrationRequest;

import java.util.List;

public class EmailValidator extends Validator {

    private final List<String> registeredEmails = List.of("Email1", "Email2", "Email3", "Email4", "Email5");

    public EmailValidator(Validator nextValidator) {
        super(nextValidator);
    }

    @Override
    public boolean validate(RegistrationRequest request) {
        if (isEmailRegistered(request.getEmail())) {
            return false;
        }

        return super.validate(request);
    }

    private boolean isEmailRegistered(String email) {
        return registeredEmails.contains(email);
    }
}
