package org.example.DIP.good.auth;

public class Auth {

    private final IUserProvider userProvider;

    public Auth(IUserProvider userProvider) {
        this.userProvider = userProvider;
    }

    public boolean check(String username, String password) {
        boolean userExists = userProvider.findUser(username);
        if (!userExists) {
            throw new Error("User not found");
        }

        return true;
    }
}
