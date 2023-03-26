package TestReflection.annotation;


import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@MyAnnotation(name = "class", value = 10)
public class MyClass {

    @MyAnnotation(name = "field", value = 20)
    public String field;

    @MyAnnotation(name = "method", value = 30)
    public void doSomething(@MyAnnotation(name = "parameterString", value = 40) String str,
                            @MyAnnotation(name = "parameterInt", value = 50) int num) {
        System.out.println(str + num);
    }


    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException {
        Class<MyClass> myClass = MyClass.class;

        System.out.println("CLASS");
        Annotation[] annotations = myClass.getAnnotations();
        for (Annotation a : annotations) {
            if (a instanceof MyAnnotation) {
                System.out.println(((MyAnnotation) a).name());
                System.out.println(((MyAnnotation) a).value());
                System.out.println(((MyAnnotation) a).always());
            }
        }
        System.out.println("-----------------");

        MyAnnotation myAnnotation = myClass.getAnnotation(MyAnnotation.class);
        if (myAnnotation != null) {
            System.out.println(myAnnotation.name());
            System.out.println(myAnnotation.value());
            System.out.println(myAnnotation.always());
        }

        System.out.println();
        System.out.println("FIELD");
        Field field = myClass.getField("field");
        Annotation[] fieldAnnotations = field.getAnnotations();

        for (Annotation a : fieldAnnotations) {
            if (a instanceof MyAnnotation) {
                System.out.println(((MyAnnotation) a).name());
                System.out.println(((MyAnnotation) a).value());
                System.out.println(((MyAnnotation) a).always());
            }
        }
        System.out.println("-----------------");

        MyAnnotation myFieldAnnotations = field.getAnnotation(MyAnnotation.class);
        if (myFieldAnnotations != null) {
            System.out.println(myFieldAnnotations.name());
            System.out.println(myFieldAnnotations.value());
            System.out.println(myFieldAnnotations.always());
        }

        System.out.println();
        System.out.println("METHOD");

        Method method = myClass.getMethod("doSomething", String.class, int.class);

        Annotation[] an = method.getAnnotations();
        for (Annotation a : an) {
            if (a instanceof MyAnnotation) {
                System.out.println(((MyAnnotation) a).name());
                System.out.println(((MyAnnotation) a).value());
                System.out.println(((MyAnnotation) a).always());
            }
        }
        System.out.println("--------------");
        MyAnnotation methodAn = method.getAnnotation(MyAnnotation.class);
        if (methodAn != null) {
            System.out.println(methodAn.name());
            System.out.println(methodAn.value());
            System.out.println(methodAn.always());
        }
        System.out.println();
        System.out.println("METHOD PARAMETERS");


        Method doSomething = myClass.getMethod("doSomething", String.class, int.class);
        Annotation[][] parametrsAnnotation = doSomething.getParameterAnnotations();
        Class<?>[] parametersType = doSomething.getParameterTypes();

        int i = 0;
        for (Annotation[] a : parametrsAnnotation) {
            Class<?> parameter = parametersType[i++];
            for (Annotation aa : a) {
                if (aa instanceof MyAnnotation) {
                    System.out.println(parameter.getName());
                    System.out.println(((MyAnnotation) aa).name());
                    System.out.println(((MyAnnotation) aa).value());
                    System.out.println(((MyAnnotation) aa).always());
                }
            }
            System.out.println("xxxxxxx");
        }
        System.out.println("--------------");
    }
}
