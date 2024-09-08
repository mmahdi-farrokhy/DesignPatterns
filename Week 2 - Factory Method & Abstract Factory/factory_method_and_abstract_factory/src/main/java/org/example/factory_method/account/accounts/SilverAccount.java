package org.example.factory_method.account.accounts;

import org.example.factory_method.account.Account;

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
