package TestSerializable.Ser;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class User extends ParentOfUser implements Serializable {
    static int id;
    public String name;
    public int age;
    public transient String password;
    Address address;

    public User(String name, int age, String password, Address address) {
        System.out.println("Конструктор юзера");
        id = 10;
        this.name = name;
        this.age = age;
        this.password = password;
        this.address = address;
        this.parentsName = "parentsNameFromUser";
        System.out.println("Созданный юзер " + this);
        System.out.println("-------------");
    }

    public static void serializeStatic(ObjectOutputStream out) throws IOException {
        out.writeInt(id);
    }
    public static void deserializeStatic(ObjectInputStream in) throws IOException {
        id = in.readInt();
    }


    @Override
    public String toString() {
        return "User{" +"id=" + id +
               ", name='" + name + '\'' +
               ", age=" + age +
               ", PASSWORD='" + password + '\'' +
               ", address=" + address + super.toString()+
               '}';
    }
}
