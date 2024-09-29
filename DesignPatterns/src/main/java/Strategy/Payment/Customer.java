package Strategy.Payment;

import lombok.Getter;

@Getter
public class Customer {
    private double credit;

    public void increaseCredit(double amount) {
        this.credit += amount;
    }

    public void decreaseCredit(double amount) {
        this.credit -= amount;
    }
}
