package com.damon.algorithm.string;

public class ReverseWords_Offer_58 {

    public String reverseWords(String s) {
        s = s.trim();
        int j = s.length() - 1, i = j;
        StringBuffer res = new StringBuffer();
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) != ' ') i--;
            res.append(s.substring(i + 1, j + 1));
            res.append(" ");
            while (i >= 0 && s.charAt(i) == ' ') i--;
            j = i;
        }
        return res.toString().trim();
    }

    public String reverseLeftWords(String s, int n) {
        StringBuffer sb = new StringBuffer();
        for (int i = n; i < n + s.length(); i++) {
            sb.append(s.charAt(i % s.length()));
        }
        return sb.toString();
    }
}
