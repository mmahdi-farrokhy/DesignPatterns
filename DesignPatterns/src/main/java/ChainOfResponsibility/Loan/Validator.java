package ChainOfResponsibility.Loan;

import ChainOfResponsibility.Loan.employee.Employee;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Validator {
    private Validator nextValidator;

    public boolean validate(Employee employee, LoanRequest request) {
        if (nextValidator == null) {
            return true;
        }

        return nextValidator.validate(employee, request);
    }
}
