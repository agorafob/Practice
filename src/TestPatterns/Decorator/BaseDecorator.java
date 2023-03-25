package TestPatterns.Decorator;

public class BaseDecorator implements PrintLine {

    public final PrintLine lineToDecorate;

    public BaseDecorator(PrintLine lineToDecorate) {
        this.lineToDecorate = lineToDecorate;
    }

    @Override
    public void print(String line) {
        lineToDecorate.print(line + " base decorator ");
    }
}
