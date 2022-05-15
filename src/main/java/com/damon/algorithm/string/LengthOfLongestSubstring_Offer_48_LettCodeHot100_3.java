package com.damon.algorithm.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LengthOfLongestSubstring_Offer_48_LettCodeHot100_3 {

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int res = 0, tmp = 0;
        for (int j = 0; j < s.length(); j++) {
            int i = map.getOrDefault(s.charAt(j), -1);
            map.put(s.charAt(j), j);
            tmp = tmp < j - i ? tmp + 1 : j - i;
            res = Math.max(res, tmp);
        }
        return res;
    }

    public int lengthOfLongestSubstring2(String s) {
        Set<Character> set = new HashSet<>();
        int res = 0, rk = 0;
        for (int j = 0; j < s.length(); j++) {
            if (rk > 0) {
                set.remove(s.charAt(j - 1));
            }
            while (rk < s.length() && !set.contains(s.charAt(rk))) {
                set.add(s.charAt(rk));
                rk++;
            }
            res = Math.max(res, rk - j);
        }
        return res;
    }

}
