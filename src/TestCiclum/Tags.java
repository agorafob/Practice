package TestCiclum;
import java.util.Arrays;
import java.util.List;

public class Tags {
    public static void main(String[] args) {
        int[] a = {2, 3, 6, 10, 1, 1};
        int[] b = {6, 3, 4, -1, 9, 17};
        int[] c = {-1, -2, -3, 8, 7};
        int[] d = {100, 200, 300, 50, 10};
        System.out.println(getMaximumEvenSum(a, b, c, d));

    }

    static int getMaximumEvenSum(int[]... arg) {
        int maxEvenSum = 0;
        int[] winningArray = null;
        List<int[]> arrays = List.of(arg);
        for (int[] arr : arrays) {
            int sum = 0;
            for (int i : arr) {
                sum += i;
            }
            if (sum % 2 == 0 && sum > maxEvenSum) {
                maxEvenSum = sum;
                winningArray = arr;
            }
        }
        if (winningArray != null) {
            System.out.println(Arrays.toString(winningArray));
        }
        return maxEvenSum;
    }
}
