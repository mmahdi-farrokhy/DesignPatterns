package template_method.salary;

public class HourlySalary extends Salary{
    @Override
    protected double calculateBaseSalary() {
        return 0;
    }

    @Override
    protected double calculateBonus() {
        return 0;
    }
}
