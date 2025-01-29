package leercode热题100.滑动窗口;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 找到字符串中所有字母异位词438 {
    public static void main(String[] args) {
        找到字符串中所有字母异位词438 aa = new 找到字符串中所有字母异位词438();
        List<Integer> anagrams = aa.findAnagrams("abab", "ab");
        System.out.println(anagrams);
    }

    public List<Integer> findAnagrams(String s, String p) {
        if (s.length() < p.length()) {
            return new ArrayList<>();
        }
        int[] snum = new int[26];
        int[] pnum = new int[26];
        List<Integer> result = new ArrayList<>();
        //  使用数组判断是否数量个数一致
        for (int i = 0; i < p.length(); i++) {
            ++snum[s.charAt(i) - 'a'];
            ++pnum[p.charAt(i) - 'a'];
        }
        if (Arrays.equals(snum, pnum)) {
            result.add(0);
        }
        for (int i = 0; i < s.length() - p.length(); i++) {
            --snum[s.charAt(i) - 'a'];
            ++snum[s.charAt(i + p.length()) - 'a'];
            if (Arrays.equals(snum, pnum)) {
                result.add(i + 1);
            }
        }
        return result;
    }
}
