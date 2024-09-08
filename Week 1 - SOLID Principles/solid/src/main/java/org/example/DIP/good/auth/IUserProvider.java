package org.example.DIP.good.auth;

public interface IUserProvider {
    boolean findUser(String username);
}
