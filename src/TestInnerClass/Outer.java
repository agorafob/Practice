package TestInnerClass;

public class Outer {
    private int a = 10;
    private static int b = 20;
    int[] test = new int[2];
    int aa = test.length;
    public TestClass t = new TestClass(){

        public void test2(){
            System.out.println("test2");
        }

        public void test1() {
            System.out.println("silent t1");
        }
    };


    void test() {
        System.out.println("private a from outer " + a);
        System.out.println("private b from outer " + b);
        Inner innerInOuter = new Inner();
        Nested nestedInOuter = new Nested();
        System.out.println("test from innerInOuter:");
        System.out.println("test from nestedInOuter:");
        nestedInOuter.test();
        System.out.println("---------");
    }

    public InterfaceForLocal methodWithLocalClassWithInterface(){
       class LocalClass implements InterfaceForLocal {
           @Override
           public void methodFromInterfaceForLocal() {
               System.out.println("InterfaceForLocal methodWithLocalClassWithInterface " +
                                  "+ LocalClass implements InterfaceForLocal");
               System.out.println("---------");
           }
       }
       return new LocalClass();
    }

    public void methodWithAbstractClass(){
        AbstractInterface x = ()-> System.out.println("This is methodFromAbstractInterface with lambda. " +
                                                      "Anonymous class");

        AbstractInterface ab = new AbstractInterface() {
            @Override
            public void methodFromAbstractInterface() {
                System.out.println("This is methodFromAbstractInterface");
                System.out.println("---------");
            }
        };
        x.methodFromAbstractInterface();
        ab.methodFromAbstractInterface();
    }

    class Inner{
        int innerInt = 60;

        void test() {
            a = 15;
            b = 25;

            System.out.println("private a from inner " + a);
            System.out.println("private b from inner " + b);
            System.out.println("innerInt " + innerInt);
            class LocalClass implements InterfaceForLocal {
                void test() {
                    a = 205;
                    b = 305;
                    System.out.println("private a from inner Local " + a);
                    System.out.println("private b from inner Local " + b);
                }

                @Override
                public void methodFromInterfaceForLocal() {
                    System.out.println("LocalClass implements InterfaceForLocal + methodFromInterfaceForLocal");
                }
            }
            LocalClass localInInner = new LocalClass();
            localInInner.test();
            localInInner.methodFromInterfaceForLocal();
        }
    }

    static class Nested extends Outer implements AbstractInterface{
        int nestedInt = 50;

        void test() {
            b = 30;

            System.out.println("private b from nested " + b);
            System.out.println("nestedInt " + nestedInt);

            class LocalClass {
                void test() {
                    b = 600;
                    System.out.println("private b from nested Local " + b);
                }
            }
            LocalClass localInInner = new LocalClass();
            localInInner.test();
        }

        @Override
        public void methodFromAbstractInterface() {
            System.out.println("methodFromAbstractInterface from static nested class");
        }
    }

    static class Nested2 extends Nested{

    }
}

