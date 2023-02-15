public class trueOrFalseChecker {

    static int foo1 = 0;
    static int foo2 = 0;

    static boolean foo1()
    {
        foo1++;
        System.out.print("true  ");
        System.out.println(foo1);
        return true;
    }
    static boolean foo2()
    {
        foo2++;
        System.out.print("false  ");
        System.out.println(foo2);
        return false;
    }
    public static void main(String[] args){
        boolean bool;
        System.out.println("true or false");
        bool = foo1()||foo2();
        System.out.println("true and false");
        bool = foo1()&&foo2();
        System.out.println("false or true");
        bool = foo2()||foo1();
        System.out.println("false and true");
        bool = foo2()&&foo1();
    }

}
