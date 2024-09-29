package Solid.DIP.good.dispatcher;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserService {
    private final IDispatcher dispatcher;

    public void register(UserRegisterParams params) {
        // User registration process

        UserRegisterParams obj = new UserRegisterParams();
        obj.firstName = params.firstName;
        obj.lastName = params.lastName;
        obj.email = params.email;

        dispatcher.dispatch("user_register", obj);
    }
}
