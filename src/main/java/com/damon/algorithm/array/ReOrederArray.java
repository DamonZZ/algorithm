package com.damon.algorithm.array;

import java.util.Arrays;

public class ReOrederArray {

    public int[] reOrder(int[] array) {

        if (array == null || array.length < 1) {
            return array;
        }

        int[] result = Arrays.copyOf(array, array.length);

        for (int i = 0; i < result.length; i++) {
            if (this.isEven(result[i])) {
                for (int j = i + 1; j < result.length; j++) {
                    if (!this.isEven(result[j])) {
                        int odd = result[j];
                        for (int k = j; k > i; k--) {
                            result[k] = result[k - 1];
                        }
                        result[i] = odd;
                        break;
                    }
                }
            }
        }
        return result;
    }

    private boolean isEven(int input) {
        return (input & 1) == 0 ? true : false;
    }

}
