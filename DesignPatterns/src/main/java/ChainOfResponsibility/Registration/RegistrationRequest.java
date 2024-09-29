package ChainOfResponsibility.Registration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class RegistrationRequest {
    private String email;
    private String password;
    private String referralCode;
}
