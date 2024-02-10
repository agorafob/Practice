package TestPolymorphism;

public class PrintString implements PrintValue{
    String value = "This is string";

    @Override
    public void print() {
        System.out.println(value);
    }
}
