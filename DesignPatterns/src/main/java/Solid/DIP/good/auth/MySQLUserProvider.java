package Solid.DIP.good.auth;

import org.example.DIP.bad.auth.MySQLConnection;

public class MySQLUserProvider implements IUserProvider {
    private final MySQLConnection connection;

    public MySQLUserProvider(MySQLConnection connection) {
        this.connection = connection;
    }

    @Override
    public boolean findUser(String username) {
        String sql = "SELECT * FROM users WHERE username = '" + username + "'";
        return connection.query(sql);
    }
}
