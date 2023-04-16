package TestHillel.lesson23_design.stage3.companies;

import TestHillel.lesson23_design.stage3.employees.Employee;

import java.util.List;

public abstract class Company {

    abstract List<Employee> getEmployees();

    public void createSoftware() {
        System.out.println("Company createSoftware()");
        List<Employee> list = getEmployees();
        for (Employee e:list) {
            e.doWork();
        }
    }
}
