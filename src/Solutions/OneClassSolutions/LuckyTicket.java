package Solutions.OneClassSolutions;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LuckyTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = Arrays.asList(String.valueOf(sc.nextInt()).split(""));
        int[] a = {0};
        int[] b = {0};
        list.subList(0, list.size() / 2).forEach(x -> a[0] += Integer.parseInt(x));
        list.subList(list.size() / 2, list.size()).forEach(x -> b[0] += Integer.parseInt(x));
        System.out.println(a[0]==b[0]?"equal":"not equal");

//        Scanner sc = new Scanner(System.in);
//        String[] b = String.valueOf(sc.nextInt()).split("");
//        int right =0;
//        int left = 0;
//        for (int i = 0; i < b.length/2; i++) {
//            right+=Integer.parseInt(b[i]);
//            left+=Integer.parseInt(b[b.length-i-1]);
//        }
//        System.out.println(right==left?"equal":"not equal");
    }

}
