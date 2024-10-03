package Visitor.Tax.employees;

import Visitor.Tax.Employee;
import Visitor.Tax.Visitor;

public class Manager implements Employee {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitHighRangeSalary(this);
    }

    public double getSalary(){
        return 10000;
    }
}
