package Facade.Permission;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class UserAuthentication {
    private List<String> registeredUsers;

    public boolean query(String user) {
        return registeredUsers.contains(user);
    }
}
