package com.damon.algorithm.integer;

public class IntegerUsage {

    // #62
    public int lastRemaining(int n, int m) {
        if (n < 1 || m < 1) {
            return -1;
        }
        int last = 0;
        for (int i = 2; i <= n; i++) {
            last = (last + m) % i;
        }
        return last;
    }

    // #63
    public int sum(int n) {
        int sum = n;
        boolean flag = (n > 0) && ((sum += this.sum(n - 1)) > 0);
        return sum;
    }

}
