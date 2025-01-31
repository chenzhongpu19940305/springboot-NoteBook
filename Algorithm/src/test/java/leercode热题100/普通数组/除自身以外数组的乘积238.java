package leercode热题100.普通数组;

public class 除自身以外数组的乘积238 {
    public int[] productExceptSelf(int[] nums) {
        // 就是处理0
        int sum = 1;
        int zeroCount = 0;
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
                continue;
            }
            sum *= nums[i];
        }
        if (zeroCount > +2) {
            return result;
        }
        if (zeroCount == 1) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    result[i] = sum;
                } else result[i] = 0;
            }
        }
        if (zeroCount == 0) {
            for (int i = 0; i < nums.length; i++) {
                result[i] = sum / nums[i];
            }
        }
        return result;
    }
}
