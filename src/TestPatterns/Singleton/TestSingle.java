package TestPatterns.Singleton;

public class TestSingle {
    public static void main(String[] args) {
        Singleton first = Singleton.getInstance("Alik");
        Singleton second = Singleton.getInstance("Val");
        System.out.println(first.getName());
        System.out.println(second.getName());
    }

}
