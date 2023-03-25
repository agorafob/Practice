package TestSerializable.Ser;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        User initialUser = new User("Alik", 34, "alik",
                new Address("Griboedova", 2));
        File file = new File("D:\\JavaPractice\\Practice\\src\\TestSerializable\\Ser\\user.ser");
        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream(file));
             ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {

            User.serializeStatic(out);
            out.writeObject(initialUser);

            initialUser = null;
            System.out.println("Old static field id = " + User.id);
            User.id = 55;
            System.out.println("New static field id = " + User.id);

            User.deserializeStatic(in);
            User coppiedUser = (User) in.readObject();

            System.out.println("initialUser = " + initialUser);
            System.out.println("coppiedUser = " + coppiedUser);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка сериализации");
        }
    }
}
