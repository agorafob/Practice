package TestInheritance;

public class F extends E{
    int x = 3;

    void print(){
        System.out.println("F");
        System.out.println("x " + (super.x+2));
        System.out.println("x " + (x+2));
        System.out.println("x " + (this.x+2));

    }
}
