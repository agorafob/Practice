package TestHillel.lesson23_design.stage1;

public class Company {


    void createSoftware() {
        System.out.println("Company createSoftware()");
        Designer d = new Designer();
        Programmer p = new Programmer();
        Tester t = new Tester();
        d.designArchitecture();
        p.writeCode();
        t.testSoftware();
    }
}
