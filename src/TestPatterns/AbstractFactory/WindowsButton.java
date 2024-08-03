package TestPatterns.AbstractFactory;

public class WindowsButton implements Button{
    @Override
    public void paint() {
        System.out.println("This is Windows Button");
    }
}
