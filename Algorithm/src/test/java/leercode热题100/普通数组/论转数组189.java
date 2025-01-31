package leercode热题100.普通数组;

import java.util.Arrays;

public class 论转数组189 {
    public static void main(String[] args) {
        论转数组189 l = new 论转数组189();
        int[] nums = {-1};
        l.rotate(nums, 2);
        System.out.println(nums);
    }

    public void rotate(int[] nums, int k) {
       int[] result = new int[nums.length];
       for(int i=0;i<nums.length;i++){
           result[(i+k)%nums.length]=nums[i];
       }
       System.arraycopy(result,0,nums,0,nums.length);
    }
}
