package Visitor.Tax;

import Visitor.Tax.employees.Developer;
import Visitor.Tax.employees.Manager;
import Visitor.Tax.employees.TeamLead;

public interface Visitor {
    void visitHighRangeSalary(Manager manager);

    void visitMidRangeSalary(TeamLead teamLead);

    void visitLowRangeSalary(Developer developer);
}
