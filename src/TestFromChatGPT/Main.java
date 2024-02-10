package TestFromChatGPT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
1. Create a program which prints the sum of two numbers.
2. Write a program which prints the largest of three numbers.
3. Create a program which prints the first 10 Fibonacci numbers.
4. Write a program which prints all the prime numbers between 1 and 100.
5. Create a program which prints the factorial of a given number.
6. Write a program which prints the sum of the digits of a given number.
7. Create a program which prints all the leap years between two given years.
8. Write a program to find the roots of a quadratic equation.
9. Create a program which prints all the Armstrong numbers between 1 and 1000.
10. Write a program which prints the sum of all the even numbers between 1 and 10.
 */
public class Main {
    public static void main(String[] args) {
//        System.out.println(sum(1, 2));
//        System.out.println(largest(10, 1, 11));
//        printFibonacci(10);
//        System.out.println(fact(5));
//        sumOfDigitsInNumber(15);
        leapYearsBetween(2029, 2031);
    }

    //1. Create a program which prints the sum of two numbers.
    static double sum(double a, double b) {
        return a + b;
    }

    //2. Write a program which prints the largest of three numbers.
    static int largest(int a, int b, int c) {
        int[] values = {a, b, c};
        return Arrays.stream(values).max().getAsInt();
    }

    // 3. Create a program which prints the first 10 Fibonacci numbers.
    static void printFibonacci(int n) {
        List<Long> list = new ArrayList<>();
        if (n == 0) {
            System.out.println("Нет такого элемента");
            return;
        }
        for (int i = 1; i <= n; i++) {
            switch (i) {
                case 1 -> list.add(0L);
                case 2, 3 -> list.add(1L);
                default -> list.add(list.get(i - 3) + list.get(i - 2));
            }
        }
        System.out.println(Arrays.toString(list.toArray()));
    }

    //  4. Write a program which prints all the prime numbers between 1 and 100.
    static void firstNPrimeNumbers(int n) {
        for (int j = 2; j < Integer.MAX_VALUE; j++) {
            int counter = 0;
            for (int k = 2; k <= j; k++) {
                if (j % k == 0) {
                    counter++;
                }
            }
            if (counter == 1) {
                System.out.println("prime " + j);
                n--;
            }
            if (n == 0) {
                break;
            }
        }
    }

    //5. Create a program which prints the factorial of a given number.
    static int fact(int startNumber) {
        if (startNumber <= 1) {
            return 1;
        }
        return startNumber * (fact(startNumber - 1));
    }

    //    6. Write a program which prints the sum of the digits of a given number.
    static void sumOfDigitsInNumber(int number) {

        if (number < 10) {
            System.out.println(number);
        } else {
            int sum = 0;
            String[] str = Integer.toString(number).split("");
            for (String s : str) {
                sum += Integer.parseInt(s);
            }
            System.out.println(sum);
        }
    }

    //    7. Create a program which prints all the leap years between two given years.
    static void leapYearsBetween(int start, int finish) {
        if (start>=finish) System.out.println("Start should be less than finish");
        if (start % 4 != 0) start += 4 - start % 4;
        for (int i = start; i <= finish; i += 4) {
            System.out.println(i);
        }
    }

}