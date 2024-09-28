package template_method.salary;

public class RemoteSalary extends Salary {
    @Override
    protected double calculateBaseSalary() {
        return 1500;
    }

    @Override
    protected double calculateBonus() {
        return 250;
    }
}
