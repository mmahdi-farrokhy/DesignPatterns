package Solid.DIP.bad.auth;

public class Auth {

    private final MySQLConnection connection;

    public Auth(MySQLConnection connection) {
        this.connection = connection;
    }

    public boolean check(String username, String password) {
        boolean userExists = connection.query("SELECT * FROM users WHERE username = '" + username + "';");
        if (!userExists) {
            throw new Error("User not found");
        }

        return true;
    }
}
