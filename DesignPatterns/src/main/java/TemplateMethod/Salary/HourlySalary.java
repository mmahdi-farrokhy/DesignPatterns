package TemplateMethod.Salary;

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
