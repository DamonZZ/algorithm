package com.damon.algorithm.string;

public class LongestPalindrome_LeetCode_Hot100_5 {

    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2) return s;

        int maxLen = 1, begin = 0;
        boolean[][] dp = new boolean[len][len];

        char[] charArray = s.toCharArray();
        for (int step = 1; step < len; step++) {
            for (int i = 0; i < len; i++) {
                int j = step + i;
                if (j >= len) break;

                if (charArray[i] != charArray[j]) {
                    dp[i][j] = false;
                } else {
                    if (j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }

                if (dp[i][j] && (j - i + 1 > maxLen)) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }

        return s.substring(begin, begin + maxLen);
    }

}
