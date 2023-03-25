package TestPatterns.Decorator;

public class DecoratorAddInteger extends BaseDecorator {

    public DecoratorAddInteger(PrintLine lineToDecorate) {
        super(lineToDecorate);
    }

    @Override
    public void print(String line) {
        super.print(addInteger(line));
    }

    private String addInteger(String line){
        return line + " " +1000+" ";
    }
}
