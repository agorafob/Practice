package TestExcptn;

public class Main {
    public static void main(String[] args) {
        try {
            new UserValidator().validate(new User("dddd",19,"hiuhi"));
        } catch (TestException | TestException2 e){
            System.out.println(e.getMessage());
        }
    }
}
