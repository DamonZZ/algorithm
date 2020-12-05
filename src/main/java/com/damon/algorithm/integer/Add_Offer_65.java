package com.damon.algorithm.integer;

public class Add_Offer_65 {

    // can't use +,-,*,/
    public int add(int a, int b) {
        int c = (a & b) << 1;
        int s = a ^ b;
        while (c != 0) {
            int temp = s ^ c;
            c = (s & c) << 1;
            s = temp;
        }
        return s;
    }

}
