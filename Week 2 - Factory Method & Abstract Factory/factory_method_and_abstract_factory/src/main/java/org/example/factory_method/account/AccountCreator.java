package org.example.factory_method.account;

public abstract class AccountCreator {
    public abstract Account createAccount();

    public CustomerAccount registerAccount(User user, double balance) {
        Account account = createAccount();

        if (balance < account.minimumBalance()) {
            throw new Error("موجودی اولیه کمتر از حد مجاز است.");
        }

        CustomerAccount customerAccount = new CustomerAccount(user, account.interestRate(), account.minimumBalance());
        customerAccount.save();
        return customerAccount;
    }
}
