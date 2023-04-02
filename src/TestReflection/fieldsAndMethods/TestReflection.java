package TestReflection.fieldsAndMethods;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class TestReflection {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class<MyClass> myClass = MyClass.class;
        Field age = myClass.getField("age");
        int newAge = age.getInt(new MyClass());
        System.out.println(newAge);
        Field name = myClass.getDeclaredField("NAME");
        name.setAccessible(true);
        String newName = (String) name.get(new MyClass());
        System.out.println(newName);
        Class<?> type = name.getType();
        System.out.println(type);
        int modifier = name.getModifiers();
        System.out.println(modifier);
        System.out.println(Modifier.isPrivate(modifier));
        System.out.println(Modifier.isFinal(modifier));
        MyClass test = new MyClass();
        System.out.println("initial age from class: " + test.age);
        Class<? extends MyClass> testClass = test.getClass();
        Field agee = testClass.getField("age");
        int ageFromClass = agee.getInt(test);
        System.out.println("initial age from field: " + ageFromClass);
        agee.setInt(test,100);
        System.out.println("age after set from field: " + agee.getInt(test));
        System.out.println("age after set from class: " + test.age);


    }
}
