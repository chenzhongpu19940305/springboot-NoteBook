package leercode热题100.滑动窗口;

import java.util.HashMap;
import java.util.Map;

public class 无重复字符的最长字串3 {
    public static void main(String[] args) {
        无重复字符的最长字串3 s = new 无重复字符的最长字串3();
        System.out.println(s.lengthOfLongestSubstring("abcabcbb"));
    }

    /**
     * 自己汗流浃背debug得到的结果
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        int r = 0;
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        int l = 0;
        while (r < s.length()) {
            char c = s.charAt(r);
            if (!map.containsKey(c)) {
                map.put(c, r);
            } else {
                // 这里的逻辑有点复杂  多写几次
                max = Math.max(r - l, max);
                l = map.get(c) + 1;
                map.clear();
                r = l;
                map.put(s.charAt(l),l);
            }
            r++;

        }
        max = Math.max(r - l, max);
        return max;
    }

}
