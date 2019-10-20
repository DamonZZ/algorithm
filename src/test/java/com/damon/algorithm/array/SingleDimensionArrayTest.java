package com.damon.algorithm.array;

import org.junit.Assert;
import org.junit.Test;

public class SingleDimensionArrayTest {

    @Test
    public void minNumberInRotateArrayTest() {

        int[] array = new int[]{3, 4, 5, 1, 2};
        int result = minNumberInRotateArray(array);
        Assert.assertEquals(1, result);

        array = new int[]{1, 0, 1, 1, 1};
        result = minNumberInRotateArray(array);
        Assert.assertEquals(0, result);

        array = new int[]{1, 2, 3, 4, 5};
        result = minNumberInRotateArray(array);
        Assert.assertEquals(1, result);

        array = null;
        result = minNumberInRotateArray(array);
        Assert.assertEquals(0, result);
    }

    private int minNumberInRotateArray(int[] array) {

        if (array == null || array.length < 1) {
            return 0;
        }

        int startIndex = 0;
        int endIndex = array.length - 1;
        int midIndex = startIndex;

        while (array[startIndex] >= array[endIndex]) {
            if (endIndex - startIndex == 1) {
                return array[endIndex];
            }

            midIndex = (startIndex + endIndex) / 2;

            if (array[midIndex] == array[startIndex] && array[midIndex] == array[endIndex]) {
                int result = array[startIndex];
                for (int i = startIndex + 1; i <= endIndex; i++) {
                    if (array[i] < result) {
                        result = array[i];
                    }
                }
                return result;
            }

            if (array[midIndex] >= array[startIndex]) {
                startIndex = midIndex;
            } else if (array[midIndex] <= array[endIndex]) {
                endIndex = midIndex;
            }

        }

        return array[midIndex];
    }

}
