package LeetCode;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int [] temp = new int[2];
        for (int i = 0 ; i<nums.length-1;i++){
            for (int j = i+1 ; j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    temp[0]=i;
                    temp[1]=j;
                    break;
                }
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] nums = {-1,-2,-3,-4,-5};
        System.out.println(Arrays.toString(twoSum(nums, -8)));
    }
}
