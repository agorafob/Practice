package TestLambda;

public class TestLambda {
    public static void main(String[] args) {
        Operation o = (x)->duplicate(x);
        System.out.println(o.calculate(2));

        Operation o2 = (x)->{
            int y = x/2;
            return duplicate(y);
        };
        System.out.println(o2.calculate(8));


        Print p = (str)-> System.out.println(str.concat("!!!"));
        p.prr("alik");

        Print pp = System.out::println;
        pp.prr("qq");

    }

    static int duplicate(int x){
        return x*3;
    }
}

@FunctionalInterface
interface Operation{
    int calculate(int x);
}

@FunctionalInterface
interface Print{
    void prr(String text);
}
