package TestAnnotation;

import java.lang.annotation.*;

/**
 annotation java doc
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Inherited
public @interface MyAnnotation {
    String name();
    int value();
    String always() default "petrosyan" ;

}
