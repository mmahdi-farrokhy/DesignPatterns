package chain_of_responsibility.product;

public class User {
    private String username;
    private UserType type;

    public User(String username, UserType type) {
        this.username = username;
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public int calculateAccountDurationMonths() {
        int accountDurationMonths = 0;

        switch (type) {
            case Bronze -> {
                accountDurationMonths = 3;
            }
            case Silver -> {
                accountDurationMonths = 6;
            }
            case Gold -> {
                accountDurationMonths = 12;
            }

        }

        return accountDurationMonths;
    }
}
