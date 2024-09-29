package Decorator.User;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserPresenter {
    private User user;

    public String getFullName() {
        return user.getFirstName() + " " + user.getLastName();
    }

    public String getPersianRegisterDate() {
        return "Date: " + user.getRegisterDate().toString();
    }
}
