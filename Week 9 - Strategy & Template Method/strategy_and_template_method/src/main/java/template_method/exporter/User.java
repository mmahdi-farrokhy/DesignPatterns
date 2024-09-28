package template_method.exporter;

public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getHashedUsername() {
        return username + username.hashCode();
    }

    public String getHashedPassword() {
        return password + password.hashCode();
    }
}
