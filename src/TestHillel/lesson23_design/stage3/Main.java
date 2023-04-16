package TestHillel.lesson23_design.stage3;

import TestHillel.lesson23_design.stage3.companies.Company;
import TestHillel.lesson23_design.stage3.companies.GameDevCompany;
import TestHillel.lesson23_design.stage3.companies.OutsourcingCompany;

public class Main {
    public static void main(String[] args) {
        Company c1 = new GameDevCompany();
        c1.createSoftware();
        System.out.println("--------");
        Company c2 = new OutsourcingCompany();
        c2.createSoftware();
    }
}
