package FactoryMethod.Account.creators;

import FactoryMethod.Account.Account;
import FactoryMethod.Account.AccountCreator;
import FactoryMethod.Account.accounts.GoldenAccount;

public class GoldenAccountCreator extends AccountCreator {
    @Override
    public Account createAccount() {
        return new GoldenAccount();
    }
}
