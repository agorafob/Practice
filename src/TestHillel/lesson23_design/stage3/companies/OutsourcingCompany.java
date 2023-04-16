package TestHillel.lesson23_design.stage3.companies;

import TestHillel.lesson23_design.stage3.employees.Employee;
import TestHillel.lesson23_design.stage3.employees.Programmer;
import TestHillel.lesson23_design.stage3.employees.Tester;

import java.util.List;

public class OutsourcingCompany extends Company{
    @Override
    List<Employee> getEmployees() {
        return List.of(new Programmer(),new Tester());
    }
}
