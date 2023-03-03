package TestEnum;

public class TestEnum {
    public static void main(String[] args) {
        Status.ACTIVE.name = "jopa";
        System.out.println(Status.ACTIVE.name());
        System.out.println(Status.ACTIVE.name);
        System.out.println(Status.ACTIVE.klichka());
        System.out.println(Status.ACTIVE);


    }
}