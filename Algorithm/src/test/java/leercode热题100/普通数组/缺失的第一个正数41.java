package leercode热题100.普通数组;

public class 缺失的第一个正数41 {
    public static void main(String[] args) {
        缺失的第一个正数41 l = new 缺失的第一个正数41();
        System.out.println(l.firstMissingPositive(new int[]{1}));
    }
    public int firstMissingPositive(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0 && nums[i] <= nums.length) {
                result[nums[i] - 1] = 1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (result[i] != 1) {
                return i + 1;
            }
        }
        return nums.length+1;
    }
}
