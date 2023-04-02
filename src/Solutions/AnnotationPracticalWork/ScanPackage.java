package Solutions.AnnotationPracticalWork;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;

public class ScanPackage {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        String packageName = "Solutions.AnnotationPracticalWork.Run";
        String annotationName = packageName + ".Start";
        Set<Class<?>> allClasses = Util.getClasses(packageName).stream().
                filter(c -> !c.getName().contains(annotationName)).collect(Collectors.toSet());

        Map<Integer,Map<Object,Method>> print = Util.getMap(allClasses,annotationName);
        Util.printMap(print);

    }


}
