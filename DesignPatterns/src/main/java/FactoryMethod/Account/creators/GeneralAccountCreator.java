package FactoryMethod.Account.creators;

import FactoryMethod.Account.Account;
import FactoryMethod.Account.AccountCreator;
import FactoryMethod.Account.accounts.GeneralAccount;

public class GeneralAccountCreator extends AccountCreator {
    @Override
    public Account createAccount() {
        return new GeneralAccount();
    }
}
