package FactoryMethod.Account.creators;

import FactoryMethod.Account.Account;
import FactoryMethod.Account.AccountCreator;
import FactoryMethod.Account.accounts.SilverAccount;

public class SilverAccountCreator extends AccountCreator {
    @Override
    public Account createAccount() {
        return new SilverAccount();
    }
}
