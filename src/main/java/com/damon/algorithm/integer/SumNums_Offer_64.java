package com.damon.algorithm.integer;

public class SumNums_Offer_64 {

    // can't use *,%,if,else,switch,case,,while,for, A?B:C
    public int sumNums(int n) {
        boolean flag = n > 0 && (n += sumNums(n - 1)) > 0;
        return n;
    }

}
