package com.damon.algorithm.hash;

import java.util.*;

public class GroupAnagrams_Hot100_49 {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            List<String> list = map.getOrDefault(key, new ArrayList());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList(map.values());
    }

}
