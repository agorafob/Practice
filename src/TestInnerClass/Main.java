package TestInnerClass;

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
        InterfaceForLocal interfaceForLocal = outer.methodWithLocalClassWithInterface();
        interfaceForLocal.methodFromInterfaceForLocal();
        outer.methodWithAbstractClass();

        Outer.Inner outInn = outer.new Inner();
        outInn.test();
        outInn.innerInt=100;
        System.out.println("outInn.innerInt " + outInn.innerInt);
        System.out.println("--------------");


        Outer.Nested outNest = new Outer.Nested();
        outNest.test();
        outNest.nestedInt=90;
        System.out.println("outNest.nestedInt " + outNest.nestedInt);
    }
}
