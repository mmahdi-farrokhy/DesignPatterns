package ChainOfResponsibility.Loan;

import lombok.AllArgsConstructor;
import lombok.Getter;

// amount of loan has a limit according to the rank of the employee
// the loans monthly payback has a limit
// not more than 3 loans are allowed simultaneously
@AllArgsConstructor
@Getter
public class LoanRequest {
    private double amount;
    private int monthsToPayback;
    private int employeeId;

    public double calculateMonthlyPayback() {
        return amount / monthsToPayback;
    }
}
