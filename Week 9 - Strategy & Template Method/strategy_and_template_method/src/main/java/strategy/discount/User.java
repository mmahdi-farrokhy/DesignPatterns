package strategy.discount;

import java.time.LocalDate;

public class User {
    private String username;
    private String password;
    private LocalDate birthDate;
    private LocalDate registrationDate;
    private double monthlyOrdersPrice;
    private double weeklyOrdersPrice;

    public User(String username, String password, LocalDate birthDate) {
        this.username = username;
        this.password = password;
        this.birthDate = birthDate;
        this.registrationDate = LocalDate.now();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public LocalDate getBirthDate() {
        return birthDate;
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

    public double getMonthlyOrdersPrice() {
        return monthlyOrdersPrice;
    }

    public double getWeeklyOrdersPrice() {
        return weeklyOrdersPrice;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }
}
