package chain_of_responsibility.registration;

public class RegistrationRequest {
    private String email;
    private String password;
    private String referralCode;

    public RegistrationRequest(String email, String password, String referralCode) {
        this.email = email;
        this.password = password;
        this.referralCode = referralCode;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getReferralCode() {
        return referralCode;
    }
}
