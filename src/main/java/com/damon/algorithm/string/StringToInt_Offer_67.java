package com.damon.algorithm.string;

public class StringToInt_Offer_67 {

    public int strToInt(String str) {
        int res = 0, flag = 1, length = str.length(), i = 0, binary = Integer.MAX_VALUE / 10;
        char mod = (Integer.MAX_VALUE % 10 + "").charAt(0);
        if (length == 0) return 0;
        while (str.charAt(i) == ' ')
            if (++i == length) return 0;
        if (str.charAt(i) == '+') {
            i++;
        } else if (str.charAt(i) == '-') {
            flag = -1;
            i++;
        }
        for (int j = i; j < length; j++) {
            if (str.charAt(j) < '0' || str.charAt(j) > '9') break;
            if (res > binary || (res == binary && (str.charAt(j) > mod))) {
                return flag == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            res = res * 10 + (str.charAt(j) - '0');
        }
        return res * flag;
    }

}
