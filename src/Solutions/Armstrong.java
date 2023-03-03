package Solutions;

// 371  = 3*3*3 + 7*7*7 + 1*1*1 = 21 + 343 + 1 = 371
public class Armstrong {
    public static void main(String[] args) {
        System.out.println(check2(1634));
        print(10);


    }

    static void print(int num) {
        int start = 10;
        int counter = 0;
        while (counter <= num) {
            if (check2(start++)) {
                System.out.print(start + " ");
                counter++;
            }

        }
    }

    static boolean check(int number) {
        int result = 0;
        String[] eachDigit = String.valueOf(number).split("");
        for (String s : eachDigit) {
            result += Math.pow(Integer.parseInt(s), eachDigit.length);
        }
        return result == number;
    }

    static boolean check2(int number) {
        int result = 0;
        String str = String.valueOf(number);
        for (int i = 0; i < str.length(); i++) {
            result += Math.pow(Integer.parseInt(Character.toString(str.charAt(i))), str.length());
        }
        return result == number;
    }


}
