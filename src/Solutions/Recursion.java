package Solutions;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(fact(0));
    }

    static int fact(int startNumber) {
        if (startNumber <= 1) {
            return 1;
        }
        return startNumber * (fact(startNumber - 1));
    }
}
