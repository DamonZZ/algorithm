package com.damon.algorithm.integer;

public class LastRemaining_Offer_62 {

    public int lastRemaining(int n, int m) {
        return this.recur(n, m);
    }

    public int recur(int n, int m) {
        if (n == 1) return 0;
        int x = this.recur(n - 1, m);
        return (m % n + x) % n;
    }


}
