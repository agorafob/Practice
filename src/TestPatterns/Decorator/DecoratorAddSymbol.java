package TestPatterns.Decorator;

public class DecoratorAddSymbol extends BaseDecorator{
    public DecoratorAddSymbol(PrintLine lineToDecorate) {
        super(lineToDecorate);
    }

    @Override
    public void print(String line) {
        super.print(addSymbol(line));
    }

    private String addSymbol(String line){
        return line+" !!!!!! ";
    }
}
