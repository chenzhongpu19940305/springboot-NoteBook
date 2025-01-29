package leercode热题100.字串;

import java.util.HashMap;
import java.util.Map;

public class 和为k的子数组560 {
    public static void main(String[] args) {
        和为k的子数组560 s = new 和为k的子数组560();
        int[] nums = {1, 2, 1, 2, 1};
        int k = 3;
        System.out.println(s.subarraySum(nums, k));
    }

    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] prenum = new int[nums.length];
        map.put(0, 1);
        prenum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prenum[i] += prenum[i - 1] + nums[i];
        }
        int count = 0;

        if (nums[0] == k) {
            count++;
        }
        for (int i = 1; i < nums.length; i++) {
            map.put(prenum[i - 1], map.getOrDefault(prenum[i - 1], 0) + 1);
            if (map.containsKey(prenum[i] - k)) {
                count += map.get(prenum[i] - k);
            }
        }
        return count;
    }
}
