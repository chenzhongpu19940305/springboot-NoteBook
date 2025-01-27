package leercode热题100.哈希;

import java.util.HashSet;
import java.util.Set;

/**
 * 数组变set 然后每一个作为开头暴力解决即可
 * 要求O(n)
 *
 * 每个数字最多被访问两次 因此依旧是O(n)
 */
public class 最长连续序列128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int max = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                while (set.contains(num + 1)) {
                    num = num + 1;
                }
                max = Math.max(max, num - currentNum+1);
            }
        }
        return max;
    }
}
