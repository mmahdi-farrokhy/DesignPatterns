package ChainOfResponsibility.Loan.validators;

import ChainOfResponsibility.Loan.LoanRequest;
import ChainOfResponsibility.Loan.Validator;
import ChainOfResponsibility.Loan.employee.Employee;

public class AmountValidator extends Validator {
    public AmountValidator(Validator nextValidator) {
        super(nextValidator);
    }

    @Override
    public boolean validate(Employee employee, LoanRequest request) {
        if (request.getAmount() > employee.calculateLoanLimit()) {
            return false;
        }

        return super.validate(employee, request);
    }
}
