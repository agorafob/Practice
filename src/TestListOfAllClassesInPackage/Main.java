package TestListOfAllClassesInPackage;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {
//        String path = Main.class.getCanonicalName();
//        System.out.println("Main.class.getCanonicalName(): " + path);
        String packageName = Main.class.getPackage().getName();
//        System.out.println("Main.class.getPackage().getName(): " + packageName);
//        URL url = Objects.requireNonNull(Main.class.getResource("."));
//        System.out.println("Main.class.getResource(\".\"): " + url.getPath());
//        Path p = Paths.get(url.toURI());
//        Path fileName = p.getFileName();
//        System.out.println("Paths.get(url.toURI()).getFileName(): " + fileName);
//        System.out.println("Paths.get(url.toURI()).getNameCount(): " + p.getNameCount());
//        for (int i = 0; i < p.getNameCount(); i++) {
//            System.out.println("p.getName(i): "+ p.getName(i));
//        }


        List<Class<?>> allClasses = getClasses(packageName);
//        System.out.println(allClasses);

    }

    static List<Class<?>> getClasses(String pack) throws IOException, URISyntaxException {
        URL url = Main.class.getResource(".");
        Path path = Paths.get(Objects.requireNonNull(url).toURI());

        List<Class<?>> allClasses = new ArrayList<>();
        Files.walkFileTree(path, new SimpleFileVisitor<>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
//                System.out.println(file);
                System.out.println(pack + "." + String.valueOf(file.getName(file.getNameCount() - 1)).split("\\.")[0]);
                try {
                    Class<?> aClass = Class.forName(pack + "." + String.valueOf(file.getName(file.getNameCount() - 1)).split("\\.")[0]);
                    System.out.println(aClass.getName());
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }


//                String className = pack + "." + String.valueOf(file.getName(file.getNameCount() - 1)).split("\\.")[0];
//                try {
//                    Class<?> aClass = Class.forName(className);
//                    allClasses.add(aClass);
//                } catch (ClassNotFoundException e) {
//                    e.printStackTrace();
//                }
                return super.visitFile(file, attrs);
            }
        });

        return allClasses;
    }


}
