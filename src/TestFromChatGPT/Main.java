package TestFromChatGPT;

import java.util.Arrays;

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
//        System.out.println(sum(1,2));
//        System.out.println(largest(10,1,11));
        System.out.println(index(2,5));

    }
    //1. Create a program which prints the sum of two numbers.
    static double sum(double a, double b){
        return a+b;
    }
    //2. Write a program which prints the largest of three numbers.
    static int largest(int a, int b, int c){
        int [] values = {a,b,c};
        return Arrays.stream(values).max().getAsInt();
    }

    static int index(int a, int b){
        return a&b;
    }
}
