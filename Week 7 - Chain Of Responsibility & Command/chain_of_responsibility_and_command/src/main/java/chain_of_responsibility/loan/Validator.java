package chain_of_responsibility.loan;

import chain_of_responsibility.loan.employee.Employee;

public abstract class Validator {
    private Validator nextValidator;

    public Validator(Validator nextValidator) {
        this.nextValidator = nextValidator;
    }

    public boolean validate(Employee employee, LoanRequest request) {
        if (nextValidator == null) {
            return true;
        }

        return nextValidator.validate(employee, request);
    }
}
