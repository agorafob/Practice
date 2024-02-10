package TestInheritance;

public class A {

    public static String staticStringA;
    public String nonStaticStringA;
    static int counterA = 0;

//    static {
//        staticStringA = "staticStringA";
//        System.out.println(++counterA + " " + staticStringA);
//    }



    public A() {
        nonStaticStringA = "nonStaticStringA";
        System.out.println(++counterA + " " + nonStaticStringA);
        staticStringA = "staticStringA";
        System.out.println(++counterA + " " + staticStringA);
    }



}
