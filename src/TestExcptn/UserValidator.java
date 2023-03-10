package TestExcptn;

public class UserValidator {

    void validate(User user){
        if(!user.getEmail().contains("@")){
            throw new TestException(" email");
        }

        if ((user.getAge()<18)){
            throw new TestException2("Test message2");
        }
    }
}
