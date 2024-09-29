package Strategy.Payment;

public class Customer {
    private double credit;

    public void increaseCredit(double amount) {
        this.credit += amount;
    }

    public void decreaseCredit(double amount) {
        this.credit -= amount;
    }

    public double getCredit() {
        return credit;
    }
}
