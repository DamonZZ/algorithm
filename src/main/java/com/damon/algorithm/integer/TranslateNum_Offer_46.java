package com.damon.algorithm.integer;

public class TranslateNum_Offer_46 {

    public int translateNum(int num) {
        String input = String.valueOf(num);
        int p = 0, q = 0, r = 1;
        for (int i = 0; i < input.length(); i++) {
            p = q;
            q = r;
            if (i == 0) continue;
            String pre = input.substring(i - 1, i + 1);
            if (pre.compareTo("10") >= 0 && pre.compareTo("25") <= 0) {
                r += p;
            }
        }
        return r;
    }

}
