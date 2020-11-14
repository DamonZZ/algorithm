package com.damon.algorithm.string;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring_Offer_48 {

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

}
