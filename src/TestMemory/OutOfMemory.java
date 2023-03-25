package TestMemory;

public class OutOfMemory {
    public static void main(String[] args) {
        A aa = new A();

    }

}

class A{
    B b;
    A(){
        b = new B();
    }
}

class B{
    A a;

    B(){
        a = new A();
    }

}

class C{}
