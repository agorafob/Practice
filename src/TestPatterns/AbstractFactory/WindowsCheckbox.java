package TestPatterns.AbstractFactory;

public class WindowsCheckbox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("This is Windows Checkbox");
    }
}
