package FactoryMethod.Account.accounts;

import FactoryMethod.Account.Account;

public class SilverAccount implements Account {
    @Override
    public double interestRate() {
        return 0.15;
    }

    @Override
    public double minimumBalance() {
        return 10000000;
    }
}
