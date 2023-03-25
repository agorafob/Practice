package TestSerializable.Ser;

import java.io.Serializable;

public class Address implements Serializable {
    String street;
    int houseNumber;

    public Address(String street, int houseNumber) {
        System.out.println("-------------");
        System.out.println("Конструктор адреса");
        this.street = street;
        this.houseNumber = houseNumber;
        System.out.println("Созданный адресс " + this);
        System.out.println("-------------");
    }

    @Override
    public String toString() {
        return "Address{" +
               "street='" + street + '\'' +
               ", houseNumber=" + houseNumber +
               '}';
    }
}
