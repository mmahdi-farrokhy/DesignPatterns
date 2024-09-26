package chain_of_responsibility.loan.validators;

import chain_of_responsibility.loan.LoanRequest;
import chain_of_responsibility.loan.Validator;
import chain_of_responsibility.loan.employee.Employee;

public class MonthlyPaybackLimitValidator extends Validator {
    public MonthlyPaybackLimitValidator(Validator nextValidator) {
        super(nextValidator);
    }

    @Override
    public boolean validate(Employee employee, LoanRequest request) {
        if (request.calculateMonthlyPayback() > employee.calculateMonthlyPaybackLimit()) {
            return false;
        }

        return super.validate(employee, request);
    }
}