package leercode热题100.哈希;

import java.util.*;

public class 字母异位词分组49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String s:strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String s1 = new String(charArray);
            map.putIfAbsent(s1,new ArrayList<>());
            map.get(s1).add(s);
        }
        List<List<String>> result = new ArrayList<>();
        for(String s:map.keySet()){
            result.add(map.get(s));
        }
        return result;
    }
}
