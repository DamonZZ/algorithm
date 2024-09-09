package com.damon.algorithm.dynamicprogramming;

public class ClimbStairs_Hot100_70 {

    public int climbStairs(int n) {
        int p = 0, q = 0, r = 1;
        for (int i = 1; i <= n; i++) {
            q = p;
            p = r;
            r = p + q;
        }
        return r;
    }

}
