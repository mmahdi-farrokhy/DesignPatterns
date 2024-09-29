package TemplateMethod.Salary;

public class OnSiteSalary extends Salary {
    @Override
    protected double calculateBaseSalary() {
        return 200;
    }

    @Override
    protected double calculateBonus() {
        return 400;
    }
}
