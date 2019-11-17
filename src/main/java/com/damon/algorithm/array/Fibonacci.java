package com.damon.algorithm.array;

public class Fibonacci {

    // n<=39
    public int get(int n) {
        int result = 0;
        if (n <= 0) {
            return result;
        } else if (n == 1) {
            result = 1;
        } else {
            int first = 0;
            int second = 1;
            n = n - 1;
            result = getFirstPlusSecond(first,second,n);
        }
        return result;
    }

    private int getFirstPlusSecond(int first, int second, int n) {
        int result = first + second;
        n--;
        if (n > 0) {
            result = getFirstPlusSecond(second, result, n);

        }
        return result;
    }

}
