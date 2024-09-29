package FactoryMethod.Account;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CustomerAccount {
    private final User user;
    private final double rate;
    private final double balance;

    public void save() {

    }
}
