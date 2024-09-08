package org.example.factory_method.account.accounts;

import org.example.factory_method.account.Account;

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
