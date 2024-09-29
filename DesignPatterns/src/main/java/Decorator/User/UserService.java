package Decorator.User;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserService {
    User user;

    public String getUserFullName() {
        return user.presenter().getFullName();
    }
}
