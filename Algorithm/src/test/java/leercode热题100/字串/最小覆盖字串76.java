package leercode热题100.字串;

import java.util.HashMap;
import java.util.Map;

public class 最小覆盖字串76 {
    public static void main(String[] args) {
        最小覆盖字串76 dd = new 最小覆盖字串76();
        System.out.println(dd.minWindow("ADOBECODEBANC", "ABC"));
    }

    public String minWindow(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        int count = t.length();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        Map<Character, Integer> window = new HashMap<>();
        int start = 0;
        int r = 0;
        int valid = 0;
        int l = 0;
        int min = Integer.MAX_VALUE;
        while (r < s.length()) {
            char c = s.charAt(r);
            window.put(c, window.getOrDefault(c, 0) + 1);
            if (map.containsKey(c) && map.get(c) >= window.get(c)) {
                valid++;
            }
            while (valid >= count) {
                char d = s.charAt(l);
                if (map.containsKey(d) && map.get(d).equals(window.get(d))) {
                    if (r - l + 1 < min) {
                        start = l;
                        min = r - l + 1;
                    }
                    valid--;
                }
                window.put(d, window.get(d) - 1);
                l++;
            }
            r++;
        }
        if(min==Integer.MAX_VALUE){
            return "";
        }
        return s.substring(start, start + min);
    }
}
