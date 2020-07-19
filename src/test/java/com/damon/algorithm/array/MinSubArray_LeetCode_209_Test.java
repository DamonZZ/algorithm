package com.damon.algorithm.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MinSubArray_LeetCode_209_Test {

    private int[] testArray;

    private MinSubArray_LeetCode_209 minSubArray_leetCode_209;

    @Before
    public void before() {
        this.minSubArray_leetCode_209 = new MinSubArray_LeetCode_209();
        this.testArray = new int[]{2, 4, 7, 5, 3, 9, 11, 13, 8};
    }

    @Test
    public void minSubArrayLenTest() {
        int target = 20;
        int result = this.minSubArray_leetCode_209.minSubArrayLen(target, this.testArray);
        Assert.assertEquals(2, result);

    }

}
