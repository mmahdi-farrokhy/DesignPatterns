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

    public UserPresenter presenter() {
        return new UserPresenter(this);
    }
}
