package TestLambda;

public class Test2 implements Operation,Print{
    public static void main(String[] args) {
        Test2 t = new Test2();
        System.out.println(t.calculate(5));
        t.prr("aa");
    }

    @Override
    public int calculate(int x) {
        return x;
    }

    @Override
    public void prr(String text) {
        System.out.println(text.concat("!!!"));
    }
}
