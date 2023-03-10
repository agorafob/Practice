public class StringPool {
    public static void main(String[] args) {
        String s1 = "Hi";
        String a = "H";
        String b= "i";
        String s2 = a+b;
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        s2=s2.intern();
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
//        System.out.println("======================");
//        s1 = "Hi2";
//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));
//        System.out.println("======================");
//        s2 = s1;
//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));
//        System.out.println("======================");
//        s2=new String("Hi");
//        System.out.println(s1==s2);
//        System.out.println(s1.equals(s2));
//        System.out.println("======================");
//        s2=s1;
//        System.out.println(s1==s2);
//        System.out.println(s1.equals(s2));
//        System.out.println("======================");
    }
}
