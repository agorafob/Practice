package TestInheritance;

public class B extends A {
    public static String staticStringB;
    public String nonStaticStringB;
    static int counterB = 0;

//    static {
//        staticStringB = "staticStringB";
//        System.out.println(++counterB + " " + staticStringB);
//    }

    public B() {
//        super();
        nonStaticStringB = "nonStaticStringB";
        System.out.println(++counterB + " " + nonStaticStringB);
        staticStringB = "staticStringB";
        System.out.println(++counterB + " " + staticStringB);
    }
}
