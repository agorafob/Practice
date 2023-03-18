package TestStatic;

public class TestStatic {
    private static String name;
    public int age;

    static {
       name = "Alehandro";
    }

    {
        age = 6;
    }

    public TestStatic(int age) {
        this.age = age;
        name="Alik";
    }

    public TestStatic() {
    }

    public static void setName(String name) {
        TestStatic.name = name;
    }

    static String print(){
        return name;
    }

    int printAge(){
        return this.age;
    }

}