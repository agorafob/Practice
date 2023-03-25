package TestSerializable.Extern;

import java.io.*;

public class User extends ParentOfUser implements Externalizable {
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

    public User() {
    }


    @Override
    public String toString() {
        return "User{" + "id=" + id +
               ", name='" + name + '\'' +
               ", age=" + age +
               ", PASSWORD='" + password + '\'' +
               ", address=" + address + super.toString() +
               '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(id);
        out.writeObject(name);
        out.writeInt(age);
        out.writeObject(password);
        out.writeObject(address);
        out.writeObject(parentsName);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        id = in.readInt();
        name = (String) in.readObject();
        age = in.readInt();
        password = (String) in.readObject();
        address = (Address) in.readObject();
        parentsName = (String) in.readObject();
    }
}
