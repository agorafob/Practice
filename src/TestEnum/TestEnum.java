package TestEnum;

public class TestEnum {
    public static void main(String[] args) {
//        Status.ACTIVE.name = "alik";
//        System.out.println(Status.ACTIVE.name());
//        System.out.println(Status.ACTIVE.name);
//        System.out.println(Status.ACTIVE.klichka());
//        System.out.println(Status.ACTIVE);

        Calculator a = Calculator.PLUS;
        Calculator b = Calculator.PLUS;
        System.out.println(a==b);

        System.out.println(Calculator.PLUS.getNumber());
        System.out.println(Calculator.PLUS.calc(1,2));
        System.out.printf(Calculator.PLUS.toString(),"value of "," is ");
        Calculator.PLUS.printValue();
        System.out.println(Calculator.MULT.ordinal());
        System.out.println(Calculator.MINUS.getNumber());
        System.out.println(Calculator.MINUS.calc(1,2));
        System.out.println(Calculator.MULT.getNumber());
        System.out.println(Calculator.MULT.calc(1,2));
        System.out.println(Calculator.DIVIDE.getNumber());
        System.out.println(Calculator.DIVIDE.calc(1,2));


    }
}