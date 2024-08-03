package TestEnum;

public enum Calculator {
    PLUS(1,"one") {
        public double calc(double x, double y) {
            return x + y + PLUS.random;
        }
    },
    MINUS(2,"two") {
        final int minusRandom = 500;

        double calc(double x, double y) {
            return x - y - minusRandom;
        }
    },
    MULT(3,"three") {
        double calc(double x, double y) {
            return x * y * getNumber();
        }
    },
    DIVIDE(4,"four") {
        double calc(double x, double y) {
            return getNumber() / x / y;
        }
    };

    private final int number;
    private final int random = 50;
    private final String value;

    Calculator(int number, String value) {
        this.number = number;
        this.value=value;
    }

    public int getNumber() {
        return number;
    }

    abstract double calc(double x, double y);

    public void printValue(){
        System.out.println(this.value + "!!!!!!!!!");
    }

    @Override
    public String toString() {
        return "%s" + this.name()+ "%s" + this.value+"\n";
    }
}
