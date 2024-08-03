package TestInheritance;

public class X implements Three{
    public static void main(String[] args) {
        X x = new X();
        x.one();
        x.two();
        x.log();
    }

    static boolean isNull(String str) {
        System.out.println("Static method of checking for null");
        return str == null || ("".equals(str.trim()));
    }


    @Override
    public double add(int a) {
        return 0;
    }

    @Override
    public double multiply(int a) {
        return 0;
    }

    @Override
    public double substruct(int a) {
        return 0;
    }

    @Override
    public double addTWo(int a) {
        return 0;
    }

    @Override
    public double multiplyTwo(int a) {
        return 0;
    }

    @Override
    public double substructTwo(int a) {
        return 0;
    }

}
