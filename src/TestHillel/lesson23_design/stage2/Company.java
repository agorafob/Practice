package TestHillel.lesson23_design.stage2;

import java.util.List;

public class Company {

    void createSoftware() {
        System.out.println("Company createSoftware()");
        List<Employee> list = List.of(new Designer(),new Programmer(),new Tester());
        for (Employee e:list) {
            e.doWork();
        }
    }
}
