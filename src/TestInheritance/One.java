package TestInheritance;

public interface One {
    default void one() {
        System.out.println("One");
    }

    default void log(){
        System.out.println("Log one");
    }

    double add(int a);
    double multiply(int a);
    double substruct(int a);
}
