package Strategy.Discount;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class User {
    private final String username;
    private final String password;
    private final LocalDate birthDate;
    private final LocalDate registrationDate;
    private double monthlyOrdersPrice;
    private double weeklyOrdersPrice;

    public User(String username, String password, LocalDate birthDate) {
        this.username = username;
        this.password = password;
        this.birthDate = birthDate;
        this.registrationDate = LocalDate.now();
    }

    public void updateMonthlyOrdersPrice(double amount) {
        if (LocalDate.now().getDayOfMonth() == 1) {
            monthlyOrdersPrice = 0;
        }

        monthlyOrdersPrice += amount;
    }

    public void updateWeeklyOrdersPrice(double amount) {
        if (LocalDate.now().getDayOfMonth() == 1) {
            weeklyOrdersPrice = 0;
        }

        weeklyOrdersPrice += amount;
    }
}
