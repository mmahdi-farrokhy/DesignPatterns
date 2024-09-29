package ChainOfResponsibility.Product;

import java.util.Date;
import java.util.List;

public class Subscription {
    private final List<String> activatedUsernames = List.of("User1", "User2", "User3", "User4");

    private final int durationMonth;
    private Date expirationDate;

    public Subscription(int durationMonth) {
        this.durationMonth = durationMonth;
        this.expirationDate = new Date();
        this.expirationDate.setMonth(this.expirationDate.getMonth() + durationMonth);
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public static Subscription findByUserAndProduct(User user, Product product) {
        System.out.println("Subscription.findByUserAndProduct()");
        if (user == null || user.getUsername().isEmpty()) {
            return null;
        }

        return new Subscription(user.calculateAccountDurationMonths());
    }

    public boolean isExpired() {
        return new Date().before(expirationDate);
    }

    public boolean isActivated(String username) {
        return activatedUsernames.contains(username);
    }
}
