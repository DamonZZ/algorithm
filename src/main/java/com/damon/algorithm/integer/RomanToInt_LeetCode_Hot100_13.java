package com.damon.algorithm.integer;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt_LeetCode_Hot100_13 {


    private Map<Character, Integer> map = new HashMap<Character, Integer>() {
        {
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }
    };

    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int result = 0;
        int n = chars.length;
        for (int i = 0; i < n; i++) {
            int value = map.get(chars[i]);
            if (i < chars.length - 1 && value < map.get(chars[i + 1])) {
                result -= value;
            } else {
                result += value;
            }
        }
        return result;
    }

}
