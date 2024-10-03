package Visitor.Tax;

import Visitor.Tax.employees.Developer;
import Visitor.Tax.employees.Manager;
import Visitor.Tax.employees.TeamLead;

public class TaxCalculator implements Visitor {
    @Override
    public void visitHighRangeSalary(Manager manager) {
        System.out.println(STR."Managers salary is high. tax is \{0.2 * manager.getSalary()}.");
    }

    @Override
    public void visitMidRangeSalary(TeamLead teamLead) {
        System.out.println(STR."TeamLeads salary is mid. tax is \{0.1 * teamLead.getSalary()}.");
    }

    @Override
    public void visitLowRangeSalary(Developer developer) {
        System.out.println(STR."Developers salary is low. tax is \{0.05 * developer.getSalary()}.");
    }
}
