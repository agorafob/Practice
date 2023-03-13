package TestCollections;

import java.util.Arrays;

public class TestArrays {
    public static void main(String[] args) {
        String [] str1= {"1","2","3","4","5"};
        int index = 2;
        System.out.println(Arrays.toString(str1));
        System.arraycopy(str1,index+1,str1,index,str1.length-index-1);
        System.out.println(Arrays.toString(str1));

    }
}
