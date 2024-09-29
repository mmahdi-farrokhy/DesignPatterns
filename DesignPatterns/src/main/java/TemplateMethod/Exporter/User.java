package TemplateMethod.Exporter;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class User {
    private String username;
    private String password;

    public String getHashedUsername() {
        return username + username.hashCode();
    }

    public String getHashedPassword() {
        return password + password.hashCode();
    }
}
