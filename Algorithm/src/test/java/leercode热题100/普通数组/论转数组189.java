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
        int[] ss = new int[nums.length + k];
        for (int i = k; i < nums.length + k; i++) {
            ss[i] = nums[i - k];
            if (i >= nums.length) {
                ss[i - nums.length] = ss[i];
            }
        }
        // 数组复制的正确姿势
        System.arraycopy(ss, 0, nums, 0, nums.length);
        // 数组复制的错误姿势
        //nums = Arrays.copyOf(ss, nums.length);
    }
}
