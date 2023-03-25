package TestMemory;

public class StackOverFlow {
    static int chicken = 0;
    static int egg = 0;

    public static void main(String[] args) {


        chicken();
    }

    static void chicken(){
        System.out.println("chicken: " + chicken++);
        egg();
    }

    static void egg(){
        System.out.println("egg: " +egg++);
        chicken();
    }
}
