package ChainOfResponsibility.Product;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class User {
    private String username;
    private UserType type;

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
