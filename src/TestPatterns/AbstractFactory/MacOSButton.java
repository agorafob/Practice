package TestPatterns.AbstractFactory;

public class MacOSButton implements Button{
    @Override
    public void paint() {
        System.out.println("This is MacOS Button");
    }
}
