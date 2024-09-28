package template_method.salary;

public abstract class Salary {

    public double calculateSalary() {
        return calculateBaseSalary() + calculateBonus() + getExtra();
    }

    private double getExtra() {
        return 250;
    }

    protected abstract double calculateBaseSalary();

    protected abstract double calculateBonus();
}
