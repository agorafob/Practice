package TestSerializable.Extern;

public class ParentOfUser {
    String parentsName = "InitialParentsName";
    private static int counter = 0;


    public ParentOfUser() {
        System.out.println("-------------");
        System.out.println("Конструктор родителя " + ++counter);
        System.out.println(parentsName);
        this.parentsName = "parentsNameInConstructor";
        System.out.println(parentsName);
        System.out.println("-------------");
    }

    @Override
    public String toString() {
        return "ParentOfUser{" +
               "PARENTS-NAME='" + parentsName + " " + counter + '\'' +
               '}';
    }
}
