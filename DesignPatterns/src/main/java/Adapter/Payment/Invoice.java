package Adapter.Payment;

public class Invoice {
    private double amount;

    public Invoice(double amount) {
        if (amount < 0) {
            throw new Error("Amount can not be negative");
        }

        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
