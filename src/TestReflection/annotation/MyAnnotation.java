package TestReflection.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD,ElementType.PARAMETER,ElementType.FIELD})
public @interface MyAnnotation {
    String name();
    int value();
    String always() default "default value" ;



}
