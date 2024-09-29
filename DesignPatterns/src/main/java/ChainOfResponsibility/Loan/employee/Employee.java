package ChainOfResponsibility.Loan.employee;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class Employee {
    @NonNull
    protected String fullName;
    @NonNull
    protected double salary;
    private int activeLoans = 0;

    public abstract double calculateLoanLimit();

    public abstract double calculateMonthlyPaybackLimit();

    public int getActiveLoans() {
        return activeLoans;
    }

    public void incrementActiveLoans() {
        activeLoans++;
    }
}
