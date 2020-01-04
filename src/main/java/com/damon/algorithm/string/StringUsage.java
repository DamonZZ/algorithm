package com.damon.algorithm.string;

public class StringUsage {

    // #58 - 1
    public String reverseSentence(String str) {
        if (str == null || str.trim().isEmpty()) {
            return str;
        }
        String result = "";
        String reverseAll = this.reverseWord(str);
        int pStart = 0;
        int pEnd = 0;
        int i = 0;
        int length = reverseAll.length();
        while (i < length) {
            while (i < length && reverseAll.charAt(i) == ' ') {
                i++;
            }
            pStart = pEnd = i;
            while (i < length && reverseAll.charAt(i) != ' ') {
                i++;
                pEnd++;
            }
            result += this.reverseWord(reverseAll.substring(pStart, pEnd));
            if (i < length && reverseAll.charAt(i) == ' ') {
                result += reverseAll.charAt(i);
            }
        }
        return result;
    }

    // # 58 - 2
    public String leftRotateString(String str, int n) {
        if (str == null || str.trim().isEmpty()) {
            return str;
        }
        String reverseAll = this.reverseWord(str);
        String reverse1 = this.reverseWord(reverseAll.substring(0, str.length() - n));
        String reverse2 = this.reverseWord(reverseAll.substring(str.length() - n, str.length()));
        return reverse1 + reverse2;
    }

    private String reverseWord(String str) {
        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (j > i) {
            char temp = chars[j];
            chars[j] = chars[i];
            chars[i] = temp;
            i++;
            j--;
        }
        for (int k = 0; k < chars.length; k++) {
            sb.append(chars[k]);
        }
        return sb.toString();
    }

    // #67
    public int strToInt(String str) {
        if (str == null || str.length() < 1) {
            return 0;
        }
        int n = str.length();
        int flag = 1;
        int i = 0;
        long result = 0;
        if (str.charAt(i) == '-') {
            flag = -1;
        }
        if (str.charAt(i) == '-' || str.charAt(i) == '+') {
            i++;
        }

        for (; i < n; i++) {
            char number = str.charAt(i);
            if (number >= '0' && number <= '9') {
                if (((flag > 0) && (result > Integer.MAX_VALUE)) || ((flag < 0) && (-result < Integer.MIN_VALUE))) {
                    return 0;
                }
                result = (result << 1) + (result << 3) + (number - '0');
            } else {
                return 0;
            }
        }
        if (((flag > 0) && (result > Integer.MAX_VALUE)) || ((flag < 0) && (-result < Integer.MIN_VALUE))) {
            return 0;
        }
        return (int) result * flag;
    }

    // #19
    public boolean match(char[] str, char[] pattern) {
        if (str == null || pattern == null) {
            return false;
        }

        int strIndex = 0;
        int patternIndex = 0;

        return this.matchCore(str, pattern, strIndex, patternIndex);
    }

    private boolean matchCore(char[] str, char[] pattern, int strIndex, int patternIndex) {

        if (strIndex == str.length && patternIndex == pattern.length) {
            return true;
        }

        if (strIndex != str.length && patternIndex == pattern.length) {
            return false;
        }

        if (patternIndex + 1 < pattern.length && pattern[patternIndex + 1] == '*') {
            if ((strIndex != str.length && str[strIndex] == pattern[patternIndex]) || (strIndex != str.length && pattern[patternIndex] == '.')) {
                return this.matchCore(str, pattern, strIndex, patternIndex + 2) || this.matchCore(str, pattern, strIndex + 1, patternIndex);
            } else {
                return this.matchCore(str, pattern, strIndex, patternIndex + 2);
            }
        }

        if ((strIndex != str.length && str[strIndex] == pattern[patternIndex]) || (strIndex != str.length && pattern[patternIndex] == '.')) {
            return this.matchCore(str, pattern, strIndex + 1, patternIndex + 1);
        }

        return false;
    }
}
