package ChainOfResponsibility.Loan.employee;

public class SeniorEmployee extends Employee {
    public SeniorEmployee(String fullName, double salary) {
        super(fullName, salary);
    }

    @Override
    public double calculateLoanLimit() {
        return 50000000;
    }

    @Override
    public double calculateMonthlyPaybackLimit() {
        return 0.5 * salary;
    }
}
