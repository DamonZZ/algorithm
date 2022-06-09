package com.damon.algorithm.string;

public class LongestCommonPrefix_LeetCode_Hot100_14 {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        int length = strs[0].length();
        int count = strs.length;
        for (int i = 0; i < length; i++) {
            char value = strs[0].charAt(i);
            for (int j = 1; j < count; j++) {
                if (i == strs[j].length() || value != strs[j].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }

}
