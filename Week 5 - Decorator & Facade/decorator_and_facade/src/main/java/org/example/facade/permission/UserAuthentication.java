package org.example.facade.permission;

import java.util.List;

public class UserAuthentication {
    private List<String> registeredUsers;

    public UserAuthentication(List<String> registeredUsers) {
        this.registeredUsers = registeredUsers;
    }

    public boolean query(String user) {
        return registeredUsers.contains(user);
    }
}
