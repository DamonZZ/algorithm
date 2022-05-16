package com.damon.algorithm.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindMedianSortedArrays_LeetCode_Hot100_4_Test {

    private FindMedianSortedArrays_LeetCode_Hot100_4 findMedianSortedArrays;

    @Before
    public void before() {
        this.findMedianSortedArrays = new FindMedianSortedArrays_LeetCode_Hot100_4();
    }

    @Test
    public void findMedianSortedArraysTest() {
        int[] num1 = new int[]{1, 3};
        int[] num2 = new int[]{2};
        double expected = 2;
        double result = this.findMedianSortedArrays.findMedianSortedArrays(num1, num2);

        Assert.assertTrue(result == expected);

        num1 = new int[]{1, 2};
        num2 = new int[]{3, 4};
        expected = 2.5;
        result = this.findMedianSortedArrays.findMedianSortedArrays(num1, num2);

        Assert.assertTrue(result == expected);

    }

}
