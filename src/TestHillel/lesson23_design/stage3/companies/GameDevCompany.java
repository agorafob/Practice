package TestHillel.lesson23_design.stage3.companies;

import TestHillel.lesson23_design.stage3.employees.Artist;
import TestHillel.lesson23_design.stage3.employees.Designer;
import TestHillel.lesson23_design.stage3.employees.Employee;

import java.util.List;

public class GameDevCompany extends Company{
    @Override
    List<Employee> getEmployees() {
        return List.of(new Designer(), new Artist());
    }
}
