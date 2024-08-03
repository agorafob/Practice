package TestAnnotation;

import java.util.Arrays;

public class MyClassChild extends MyClass{
    public static void main(String[] args) {
        MyClassChild child = new MyClassChild();
        System.out.println(Arrays.toString(child.getClass().getAnnotations()));
    }
}
