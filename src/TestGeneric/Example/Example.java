package TestGeneric.Example;

public class Example {
    public static void main(String[] args) {
        System.out.println(count(new Integer[]{1,2,3,4,5,6,7,8} ,5  ));

    }

    static <T extends Comparable<T>> int  count( T[] arr, T value) {
        int counter = 0;
        for (T i : arr) {
            if (i.compareTo(value)>0) counter++;
        }
        return counter;
    }
}
