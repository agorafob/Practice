package Solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
        print(50);
    }

    static void print(int n) {
        List<Long> list = new ArrayList<>();
        if (n == 0 || n == 1) {
            System.out.println(0);
        } else {
            list.add(0L);
            list.add(1L);
            while (list.size() < n) {
                list.add(list.get(list.size() - 2) + list.get(list.size() - 1));
            }
        }
        System.out.println(Arrays.toString(list.toArray()));
    }
}
