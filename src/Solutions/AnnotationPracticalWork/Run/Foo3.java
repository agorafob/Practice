package Solutions.AnnotationPracticalWork.Run;

@Start(priority = 100, method = "testMethod")
public class Foo3 {
    public void run() {
        throw new IllegalStateException("This method should not be called");
    }
    public void testMethod() {
        System.out.println("Class Foo3 initialized! TEST METHOD");
    }
}
