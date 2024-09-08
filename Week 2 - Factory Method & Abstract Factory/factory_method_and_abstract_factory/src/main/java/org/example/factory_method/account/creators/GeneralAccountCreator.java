package org.example.factory_method.account.creators;

import org.example.factory_method.account.Account;
import org.example.factory_method.account.AccountCreator;
import org.example.factory_method.account.accounts.GeneralAccount;

public class GeneralAccountCreator extends AccountCreator {
    @Override
    public Account createAccount() {
        return new GeneralAccount();
    }
}
