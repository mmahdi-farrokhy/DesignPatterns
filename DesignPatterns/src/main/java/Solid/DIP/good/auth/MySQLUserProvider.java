package Solid.DIP.good.auth;


import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MySQLUserProvider implements IUserProvider {
    private final MySQLConnection connection;

    @Override
    public boolean findUser(String username) {
        String sql = "SELECT * FROM users WHERE username = '" + username + "'";
        return connection.query(sql);
    }
}
