package TestExcptn;

public class TestException extends RuntimeException{
    private static final String MESSAGE = "TestText.Test message %s";
    public TestException(String message){
        super(String.format(MESSAGE,message));
    }
}
