package Decorator.User;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@AllArgsConstructor
@Getter
public class User {
    private String firstName;
    private String lastName;
    private String email;
    private Date registerDate;

    public User(String firstName, String lastName, String email, Date registerDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.registerDate = registerDate;
    }

    public UserPresenter presenter() {
        return new UserPresenter(this);
    }
}
