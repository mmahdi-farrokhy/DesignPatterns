package FactoryMethod.Account.accounts;

import FactoryMethod.Account.Account;

public class GeneralAccount implements Account {
    @Override
    public double interestRate() {
        return 0.1;
    }

    @Override
    public double minimumBalance() {
        return 1000000;
    }
}
