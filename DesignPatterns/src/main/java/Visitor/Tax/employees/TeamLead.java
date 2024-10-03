package Visitor.Tax.employees;

import Visitor.Tax.Employee;
import Visitor.Tax.Visitor;

public class TeamLead implements Employee {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitMidRangeSalary(this);
    }

    public double getSalary(){
        return 6000;
    }
}
