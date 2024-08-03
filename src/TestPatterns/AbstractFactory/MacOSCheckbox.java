package TestPatterns.AbstractFactory;

public class MacOSCheckbox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("This is MacOS Checkbox");
    }
}
