package ChainOfResponsibility.Registration.validators;

import ChainOfResponsibility.Registration.RegistrationRequest;
import ChainOfResponsibility.Registration.Validator;

public class PasswordValidator extends Validator {
    public PasswordValidator(Validator nextValidator) {
        super(nextValidator);
    }

    @Override
    public boolean validate(RegistrationRequest request) {
        if (!isPasswordStrong(request.getPassword())) {
            return false;
        }

        return super.validate(request);
    }

    private boolean isPasswordStrong(String password) {
        if (password == null || password.length() <= 7) {
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
            }

            if (hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar) {
                return true;
            }
        }

        return false;
    }
}
