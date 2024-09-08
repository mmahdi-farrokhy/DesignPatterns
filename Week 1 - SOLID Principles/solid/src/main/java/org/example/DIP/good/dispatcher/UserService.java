package org.example.DIP.good.dispatcher;

public class UserService {
    private final IDispatcher dispatcher;

    public UserService(IDispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    public void register(UserRegisterParams params) {
        // User registration process

        UserRegisterParams obj = new UserRegisterParams();
        obj.firstName = params.firstName;
        obj.lastName = params.lastName;
        obj.email = params.email;

        dispatcher.dispatch("user_register", obj);
    }
}
