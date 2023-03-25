package TestPatterns.Decorator;

public class Main {
    public static void main(String[] args) {
        BaseLevel bl = new BaseLevel("alik");
        System.out.println("base level");
        bl.print("bl");
        System.out.println("------------");
        BaseDecorator bd = new BaseDecorator(new BaseLevel("alik"));
        System.out.println("base decorator");
        bd.print("bd");
        System.out.println("------------");
        BaseDecorator dai = new DecoratorAddInteger(new BaseLevel("alik"));
        System.out.println("decorator add integer");
        dai.print("dai");
        System.out.println("------------");
        BaseDecorator das = new DecoratorAddSymbol(new DecoratorAddInteger(new BaseLevel("alik")));
        System.out.println("decorator add symbol");
        das.print("das");
    }
}
