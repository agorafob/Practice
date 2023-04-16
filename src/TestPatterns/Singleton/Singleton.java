package TestPatterns.Singleton;

public class Singleton {
    private static volatile Singleton instance;
    String name;

    private Singleton(String name) {
        this.name = name;
    }

    public static Singleton getInstance(String name) {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton(name);
                }
            }
        }
        return instance;
    }

    public String getName() {
        return name;
    }
}
