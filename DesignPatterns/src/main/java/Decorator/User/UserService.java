package Decorator.User;

public class UserService {
    User user;

    public UserService(User user) {
        this.user = user;
    }

    public String getUserFullName() {
        return user.presenter().getFullName();
    }
}