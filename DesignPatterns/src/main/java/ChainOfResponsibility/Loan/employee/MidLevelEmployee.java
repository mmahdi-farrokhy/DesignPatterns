package ChainOfResponsibility.Loan.employee;

public class MidLevelEmployee extends Employee {
    public MidLevelEmployee(String fullName, double salary) {
        super(fullName, salary);
    }

    @Override
    public double calculateLoanLimit() {
        return 20000000;
    }

    @Override
    public double calculateMonthlyPaybackLimit() {
        return 0.35 * salary;
    }
}
