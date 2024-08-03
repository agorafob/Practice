package TestInterfaces;

public class Cls implements TestInterface{

    @Override
    public void print() {
        System.out.println("cls print");
    }

    @Override
    public void deff() {
        TestInterface.super.deff();
    }

    public static void main(String[] args) {
        Cls c = new Cls();
        c.print();
        c.deff();
        TestInterface.stt();
        TestInterface t = new Cls();
        t.deff();
        t.print();
    }
}
