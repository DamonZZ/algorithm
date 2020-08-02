package com.damon.algorithm.binary;

public class Binary_Offer_15 {

    public int getOneNumbersMethod1(int target) {
        int counts = 0;
        int compare = 1;
        while (target != 0) {
            if (target != 0) {
                counts++;
            }
            target = target & compare;
            compare = compare << 1;
        }
        return counts;
    }

    public int getOneNumbersMethod2(int target) {
        int counts = 0;
        while (target != 0) {
            counts++;
            target = (target - 1) & target;
        }
        return counts;
    }

}
