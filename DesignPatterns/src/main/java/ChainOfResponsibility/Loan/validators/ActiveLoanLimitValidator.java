package ChainOfResponsibility.Loan.validators;

import ChainOfResponsibility.Loan.LoanRequest;
import ChainOfResponsibility.Loan.Validator;
import ChainOfResponsibility.Loan.employee.Employee;

public class ActiveLoanLimitValidator extends Validator {
    public ActiveLoanLimitValidator(Validator nextValidator) {
        super(nextValidator);
    }

    @Override
    public boolean validate(Employee employee, LoanRequest request) {
        if (employee.getActiveLoans() > 3) {
            return false;
        }

        return super.validate(employee, request);
    }
}
