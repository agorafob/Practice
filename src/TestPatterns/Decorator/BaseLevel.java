package TestPatterns.Decorator;

public class BaseLevel implements PrintLine {

    private final String name;

    public BaseLevel(String line) {
        this.name = line;
    }

    @Override
    public void print(String line) {
        System.out.println(name + " *" + line + "* " + "base level");
    }
}
