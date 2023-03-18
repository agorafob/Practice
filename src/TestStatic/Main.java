package TestStatic;

public class Main {
    public static void main(String[] args) {
        System.out.println(TestStatic.print());
        TestStatic t1 = new TestStatic(5);
        TestStatic t2 = new TestStatic();
        System.out.println(TestStatic.print());
        System.out.println(t1.printAge());
        System.out.println(t2.printAge());
        TestStatic.setName("Una");
        t2.age=10;
        System.out.println(TestStatic.print());
        System.out.println(t1.printAge());
        System.out.println(t2.printAge());

    }
}
