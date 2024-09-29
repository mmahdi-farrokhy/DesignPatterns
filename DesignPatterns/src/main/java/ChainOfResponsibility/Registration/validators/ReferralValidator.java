package ChainOfResponsibility.Registration.validators;

import ChainOfResponsibility.Registration.RegistrationRequest;
import ChainOfResponsibility.Registration.Validator;

import java.util.List;

public class ReferralValidator extends Validator {
    private final List<String> validReferralCodes = List.of("ReferralCode1", "ReferralCode2", "ReferralCode3", "ReferralCode4", "ReferralCode5");

    public ReferralValidator(Validator nextValidator) {
        super(nextValidator);
    }

    @Override
    public boolean validate(RegistrationRequest request) {
        if (!isReferralValid(request.getReferralCode())) {
            return false;
        }

        return super.validate(request);
    }

    private boolean isReferralValid(String referralCode) {
        return validReferralCodes.contains(referralCode);
    }
}
