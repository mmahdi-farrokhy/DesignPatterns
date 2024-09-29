package ChainOfResponsibility.Loan;

import ChainOfResponsibility.Loan.employee.Employee;
import ChainOfResponsibility.Loan.validators.ActiveLoanLimitValidator;
import ChainOfResponsibility.Loan.validators.AmountValidator;
import ChainOfResponsibility.Loan.validators.MonthlyPaybackLimitValidator;

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
