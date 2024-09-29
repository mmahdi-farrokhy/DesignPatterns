package ChainOfResponsibility.Registration.validators;

import ChainOfResponsibility.Registration.RegistrationRequest;
import ChainOfResponsibility.Registration.Validator;

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
