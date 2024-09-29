package ChainOfResponsibility.Loan.employee;

public class JuniorEmployee extends Employee {
    public JuniorEmployee(String fullName, double salary) {
        super(fullName, salary);
    }

    @Override
    public double calculateLoanLimit() {
        return 10000000;
    }

    @Override
    public double calculateMonthlyPaybackLimit() {
        return 0.2 * salary;
    }
}
