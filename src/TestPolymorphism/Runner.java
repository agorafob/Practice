package TestPolymorphism;

public class Runner {
    public static void main(String[] args) {
        PrintValue str = new PrintString();
        PrintValue num = new PrintInt();
        str.print();
        num.print();
    }
}
