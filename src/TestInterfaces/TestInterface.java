package TestInterfaces;

public interface TestInterface {

    void print();

    default void deff(){
        System.out.println("deff");
    }

    static void stt () {
        System.out.println("stt");
    }
}
