package TestReflection.fieldsAndMethods;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestReflectionGeneral {
    public static void main(String[] args) throws ClassNotFoundException {

        MyClass test = new MyClass();
        Class<? extends MyClass> cl1 = test.getClass();
        Class<MyClass> cl2 = MyClass.class;
        Class<?> cl3 = Class.forName("TestReflection.fieldsAndMethods.MyClass");
        System.out.println("-----------------");
        System.out.println(cl1);
        System.out.println(cl2);
        System.out.println(cl3);
        System.out.println("-----------------");


        System.out.println("--------------");
        Field[] fields = cl2.getFields();
        System.out.println("getFields()");
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("--------------");
        Field[] declaredFields = cl2.getDeclaredFields();
        System.out.println("getDeclaredFields()");
        for (Field field : declaredFields) {
            System.out.println(field);
        }
        System.out.println("--------------");

        try {
            Field street = cl2.getField("street");
            System.out.println("getField : " + street);
            Field parentFieldPublic = cl2.getField("parentFieldPublic");
            System.out.println("parentFieldPublic : " + parentFieldPublic);
            Field name = cl2.getDeclaredField("NAME");
            System.out.println("getDeclaredField : " + name);
            Field blaBla = cl2.getField("blaBla");
            System.out.println(blaBla);
        } catch (Exception e) {
            System.out.println("No such field: " + e.getMessage());
        }
        System.out.println("--------------");

        Method[] methods = cl2.getMethods();
        Method[] declaredMethods = cl2.getDeclaredMethods();
        System.out.println("getMethods()");
        for (Method m : methods) {
            System.out.println(m);
        }
        System.out.println("---------");
        System.out.println("getDeclaredMethods()");
        for (Method m : declaredMethods) {
            System.out.println(m);
        }
        System.out.println("--------------");
        try {
            Method getStreet = cl2.getMethod("getStreet");
            System.out.println(getStreet);
            Method getParentFieldPublic = cl2.getMethod("getParentFieldPublic");
            System.out.println(getParentFieldPublic);
            Method getParentFieldPrivate = cl2.getMethod("getParentFieldPrivate");
            System.out.println(getParentFieldPrivate);
            Method getName = cl2.getDeclaredMethod("getName");
            System.out.println(getName);
            test.setAge(5);
            Method blaBla = cl2.getMethod("blaBla");
            System.out.println(blaBla);
        } catch (NoSuchMethodException e) {
            System.out.println("No such method " + e.getMessage());
        }
    }
}
