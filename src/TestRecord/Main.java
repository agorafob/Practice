package TestRecord;

public class Main {
    public static void main(String[] args) {
        User u = new User("alik","petrosyan");
        System.out.println(u.name());
        System.out.println(u.surname());
        u.fullName();

    }
}
