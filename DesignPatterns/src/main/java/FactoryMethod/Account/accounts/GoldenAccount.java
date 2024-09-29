package FactoryMethod.Account.accounts;

import FactoryMethod.Account.Account;

public class GoldenAccount implements Account {
    @Override
    public double interestRate() {
        return 0.2;
    }

    @Override
    public double minimumBalance() {
        return 100000000;
    }
}
