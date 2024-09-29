package Solid.DIP.bad.dispatcher;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserService {
    private final BeeDispatcher dispatcher;

    public void register(UserRegisterParams params) {
        // User registration process

        UserRegisterParams obj = new UserRegisterParams();
        obj.firstName = params.firstName;
        obj.lastName = params.lastName;
        obj.email = params.email;

        dispatcher.dispatch("user_register", obj);
    }
}
