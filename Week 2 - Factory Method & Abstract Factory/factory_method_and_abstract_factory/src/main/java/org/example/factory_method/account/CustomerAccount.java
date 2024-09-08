package org.example.factory_method.account;

public class CustomerAccount {
    private final User user;
    private final double rate;
    private final double balance;

    public CustomerAccount(User user, double rate, double balance) {
        this.user = user;
        this.rate = rate;
        this.balance = balance;
    }

    public void save() {

    }
}
