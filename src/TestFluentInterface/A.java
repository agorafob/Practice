package TestFluentInterface;

public class A {
    static String a = "A";

    private A() {
    }

    static A getInstance() {
        System.out.println("a equal:" + a);
        return new A();
    }

    A firstChange(){
        a="B";
        System.out.println("a equal:" + a);
        return this;
    }

    A secondChange(){
        a="C";
        System.out.println("a equal:" + a);
        return this;
    }
}
