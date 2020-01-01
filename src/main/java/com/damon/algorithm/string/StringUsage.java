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

}
