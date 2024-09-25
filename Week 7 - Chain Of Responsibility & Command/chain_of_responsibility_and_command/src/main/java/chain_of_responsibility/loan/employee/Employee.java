package chain_of_responsibility.loan.employee;

public abstract class Employee {
    protected String fullName;
    protected double salary;
    private int activeLoans = 0;

    public Employee(String fullName, double salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public abstract double calculateLoanLimit();

    public abstract double calculateMonthlyPaybackLimit();

    public int getActiveLoans() {
        return activeLoans;
    }

    public void incrementActiveLoans() {
        activeLoans++;
    }
}
