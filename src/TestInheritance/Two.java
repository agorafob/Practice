package TestInheritance;

public interface Two {
    default void two(){
        System.out.println("Two");
    }

    default void log(){
        System.out.println("Log two");
    }

    double addTWo(int a);
    double multiplyTwo(int a);
    double substructTwo(int a);
}
