package TestPatterns.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        Application app = Application.configureApplication("win");
        app.paint();
    }
}
