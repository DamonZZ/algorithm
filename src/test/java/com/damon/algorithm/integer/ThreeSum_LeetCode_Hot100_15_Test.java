package com.damon.algorithm.integer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class ThreeSum_LeetCode_Hot100_15_Test {

    private ThreeSum_LeetCode_Hot100_15 threeSum;

    @Before
    public void before() {
        this.threeSum = new ThreeSum_LeetCode_Hot100_15();
    }

    @Test
    public void threeSumTest() {
        int[] testNums = new int[]{-1, 0, 1, 2, -1, -4};
        int expected = 2;
        List<List<Integer>> result = this.threeSum.threeSum(testNums);
        Assert.assertEquals(expected, result.size());

    }

}
