package Solid.DIP.good.auth;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Auth {

    private final IUserProvider userProvider;

    public boolean check(String username, String password) {
        boolean userExists = userProvider.findUser(username);
        if (!userExists) {
            throw new Error("User not found");
        }

        return true;
    }
}
