package Solutions.AnnotationPracticalWork;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;

public class Util {


    public static Map<Integer, Map<Object, Method>> getMap(Set<Class<?>> allClasses, String annotationName) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Map<Integer, Map<Object, Method>> mapOfClasses = new HashMap<>();
        for (Class<?> c : allClasses) {
            if (Arrays.toString(c.getAnnotations()).contains(annotationName)) {
                Object o = c.getDeclaredConstructor().newInstance();
                Annotation[] annotations = c.getAnnotations();
                List<String> parametersInAnnotation = new ArrayList<>();
                for (Annotation a : annotations) {
                    if (a.toString().contains(annotationName)) {
                        String annotation = a.toString();
                        parametersInAnnotation = Arrays.asList(annotation.substring(annotation.
                                                                                            lastIndexOf('(') + 1, annotation.length() - 1).
                                replaceAll("[=\",]", ":").replaceAll("::", ":").
                                split(":"));
                    }
                }
                Method method = c.getMethod(parametersInAnnotation.get(1));
                Map<Object, Method> temp = new HashMap<>();
                temp.put(o, method);
                mapOfClasses.put(Integer.parseInt(parametersInAnnotation.get(3)), temp);
            }
        }
        return mapOfClasses;
    }

    public static void printMap(Map<Integer, Map<Object, Method>> mapOfClasses) throws InvocationTargetException, IllegalAccessException {
        List<Integer> priorities = new ArrayList<>(mapOfClasses.keySet().stream().toList());
        priorities.sort(Comparator.comparing(Integer::intValue).reversed());
        for (Integer i : priorities) {
            Set<Map.Entry<Object, Method>> entries = mapOfClasses.get(i).entrySet();
            for (Map.Entry<Object, Method> m : entries) {
                m.getValue().invoke(m.getKey());
            }
        }
    }


    public static Set<Class<?>> getClasses(String packageName) {
        InputStream stream = ClassLoader.getSystemClassLoader()
                .getResourceAsStream(packageName.replaceAll("[.]", "/"));
        assert stream != null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        return reader.lines()
                .filter(line -> line.endsWith(".class"))
                .map(line -> {
                    try {
                        return Class.forName(packageName + "."
                                             + line.substring(0, line.lastIndexOf('.')));
                    } catch (ClassNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                })
                .collect(Collectors.toSet());
    }
}
