package TestReflection.fieldsAndMethods;

import java.lang.reflect.Method;

public class MyClass extends MyClassParent {
    private static final String NAME = "Alik";
    public final String street = "Griboedova";
    public int age = 15;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        final Method[] method = new Method[1];
        this.age = age;
        class LocalCLass {
            void test() {
                method[0] = LocalCLass.class.getEnclosingMethod();
            }
        }
        LocalCLass l = new LocalCLass();
        l.test();
        System.out.println("getEnclosingMethod() from LocalClass inside method : " + method[0]);
    }

    public String getStreet() {
        return street;
    }

    private static String getName() {
        System.out.println(NAME);
        return NAME;
    }
}
