package com.damon.algorithm.pointer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MinWindow_Hot100_76 {

    public String minWindow(String s, String t) {
        Map<Character, Integer> tMap = new HashMap();
        Map<Character, Integer> tmpMap = new HashMap();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }

        int l = 0, r = -1;
        int len = Integer.MAX_VALUE, ansL = -1, ansR = -1;
        int sLen = s.length();

        while (r < sLen) {
            r++;
            if (r < sLen && tMap.containsKey(s.charAt(r))) {
                char c = s.charAt(r);
                tmpMap.put(c, tmpMap.getOrDefault(c, 0) + 1);
            }

            while (check(tMap, tmpMap) && l <= r) {
                if (r - l + 1 < len) {
                    len = r - l + 1;
                    ansL = l;
                    ansR = l + len;
                }

                if (tMap.containsKey(s.charAt(l))) {
                    char c = s.charAt(l);
                    tmpMap.put(c, tmpMap.getOrDefault(c, 0) - 1);
                }
                ++l;
            }
        }

        return ansL == -1 ? "" : s.substring(ansL, ansR);
    }

    public boolean check(Map<Character, Integer> tMap, Map<Character, Integer> tmpMap) {
        Iterator iter = tMap.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            Character key = (Character) entry.getKey();
            Integer value = (Integer) entry.getValue();
            if (tmpMap.getOrDefault(key, 0) < value)
                return false;
        }
        return true;
    }

}
