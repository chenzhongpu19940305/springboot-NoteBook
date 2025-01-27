package leercode热题100.双指针;

import java.util.*;

/**
 * 类比三角形  复杂度控制O(n*logn)
 */
public class 三数之和15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // 先排序
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int l = i + 1;
            int r = nums.length - 1;
            int target = -nums[i];

            // 问题转化为从数组中找到和为target的问题
            while (l < r) {
                int sum = nums[l] + nums[r];
                if (sum == target) {
                    result.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                }
                if (sum > target) {
                    r--;
                }
                if (sum < target) {
                    l++;
                }
            }
        }
        return result;
    }
}
