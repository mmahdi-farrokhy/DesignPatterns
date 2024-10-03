package Visitor.Tax.employees;

import Visitor.Tax.Employee;
import Visitor.Tax.Visitor;

public class Developer implements Employee {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitLowRangeSalary(this);
    }

    public double getSalary() {
        return 4000;
    }
}
