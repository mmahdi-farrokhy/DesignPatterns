package Solid.DIP.good.auth;

public interface IUserProvider {
    boolean findUser(String username);
}
