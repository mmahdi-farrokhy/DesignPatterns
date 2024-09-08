package org.example.factory_method.account.accounts;

import org.example.factory_method.account.Account;

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
