package ChainOfResponsibility.Loan.validators;

import ChainOfResponsibility.Loan.LoanRequest;
import ChainOfResponsibility.Loan.Validator;
import ChainOfResponsibility.Loan.employee.Employee;

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
