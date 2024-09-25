package chain_of_responsibility.loan;

import chain_of_responsibility.loan.employee.Employee;
import chain_of_responsibility.loan.validators.ActiveLoanLimitValidator;
import chain_of_responsibility.loan.validators.AmountValidator;
import chain_of_responsibility.loan.validators.MonthlyPaybackLimitValidator;

public class LoanService {
    public boolean validate(Employee employee, LoanRequest request) {
        return loanRequestValidator().validate(employee, request);
    }

    private Validator loanRequestValidator() {
        ActiveLoanLimitValidator activeLoanLimitValidator = new ActiveLoanLimitValidator(null);
        AmountValidator amountValidator = new AmountValidator(activeLoanLimitValidator);
        return new MonthlyPaybackLimitValidator(amountValidator);
    }
}
