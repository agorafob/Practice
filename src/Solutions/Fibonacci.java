package Solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
        printFibonacci(10);
    }

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
}
