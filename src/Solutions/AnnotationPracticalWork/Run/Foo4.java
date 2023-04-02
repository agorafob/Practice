package Solutions.AnnotationPracticalWork.Run;


public class Foo4 {
    public void run() {
        throw new IllegalStateException("This method should not be called");
    }

    public void initialize() {
        System.out.println("Class Foo4 initialized!");
    }
}
