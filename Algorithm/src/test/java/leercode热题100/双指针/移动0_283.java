package leercode热题100.双指针;


/**
 * 使用一个指针 i 来遍历数组，另一个指针 j 来记录非零元素的位置。
 * <p>
 * 当遍历到非零元素时，将其移动到 j 的位置，并将 j 向后移动一位。
 * <p>
 * 遍历结束后，将 j 之后的所有元素置为 0。
 * <p>
 * <p>
 * 一句话 从前往后 遍历到！=0的就慢慢往前面写
 */
public class 移动0_283 {
    public void moveZeroes(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
        }
        // 后面全部补0
        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }
}
