package Decorator.User;

public class UserPresenter {
    private User user;

    public UserPresenter(User user) {
        this.user = user;
    }

    public String getFullName() {
        return user.getFirstName() + " " + user.getLastName();
    }

    public String getPersianRegisterDate() {
        return "Date: " + user.getRegisterDate().toString();
    }
}
