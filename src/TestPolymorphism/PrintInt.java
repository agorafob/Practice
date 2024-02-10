package TestPolymorphism;

public class PrintInt implements PrintValue{
    int value = 1000;

    @Override
    public void print() {
        System.out.println(value);
    }
}
