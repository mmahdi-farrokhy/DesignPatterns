package chain_of_responsibility.loan.validators;

import chain_of_responsibility.loan.LoanRequest;
import chain_of_responsibility.loan.Validator;
import chain_of_responsibility.loan.employee.Employee;

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
