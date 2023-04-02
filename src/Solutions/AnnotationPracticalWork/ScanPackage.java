package Solutions.AnnotationPracticalWork;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;

public class ScanPackage {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        String packageName = "Solutions.AnnotationPracticalWork.Run";
        String annotationName = packageName + ".Start";
        Set<Class<?>> allClasses = getClasses(packageName).stream().
                filter(c -> !c.getName().contains(annotationName)).collect(Collectors.toSet());
        Map<Integer,Map<Object,Method>> print = new HashMap<>();
        for (Class<?> c : allClasses) {
            if (Arrays.toString(c.getAnnotations()).contains(annotationName)) {
                Constructor<?> constructor = c.getDeclaredConstructor();
                Object o = constructor.newInstance();
                Annotation [] annotations = c.getAnnotations();
                List<String> parameters = new ArrayList<>();
                for (Annotation a:annotations) {
                    if(a.toString().contains(annotationName)){
                        parameters= Arrays.asList(a.toString().substring(a.toString().lastIndexOf('(') + 1, a.toString().length() - 1).
                                replaceAll("[=\",]",":").replaceAll("::",":").split(":"));
                    }
                }
                Method method ;
                if(parameters.get(1).equals("")){
                    method=c.getMethod("run");
                }else {
                    method=c.getMethod(parameters.get(1));
                }
                Map<Object,Method> temp = new HashMap<>();
                temp.put(o,method);
                print.put(Integer.parseInt(parameters.get(3)),temp);
            }
        }

        List<Integer> list = new ArrayList<>(print.keySet().stream().toList());
        list.sort(Comparator.comparing(Integer::intValue).reversed());

        for (Integer i:list) {
            Map<Object,Method> map = print.get(i);
            System.out.println("priority :" + i);
            Set<Map.Entry<Object, Method>> entries = map.entrySet();
            for (Map.Entry<Object,Method> m:entries) {
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
