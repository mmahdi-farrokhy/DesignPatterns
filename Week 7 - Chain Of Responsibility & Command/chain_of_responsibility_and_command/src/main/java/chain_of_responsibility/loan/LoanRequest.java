package chain_of_responsibility.loan;

// amount of loan has a limit according to the rank of the employee
// the loans monthly payback has a limit
// not more than 3 loans are allowed simultaneously
public class LoanRequest {
    private double amount;
    private int monthsToPayback;
    private int employeeId;

    public LoanRequest(double amount, int monthsToPayback, int employeeId) {
        this.amount = amount;
        this.monthsToPayback = monthsToPayback;
        this.employeeId = employeeId;
    }

    public double getAmount() {
        return amount;
    }

    public int getMonthsToPayback() {
        return monthsToPayback;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double calculateMonthlyPayback() {
        return amount / monthsToPayback;
    }
}
