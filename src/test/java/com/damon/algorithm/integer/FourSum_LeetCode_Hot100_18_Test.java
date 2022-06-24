package com.damon.algorithm.integer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FourSum_LeetCode_Hot100_18_Test {

    private FourSum_LeetCode_Hot100_18 fourSum;

    @Before
    public void init() {
        this.fourSum = new FourSum_LeetCode_Hot100_18();
    }

    @Test
    public void fourSumTest() {
        int[] nums = new int[]{-2, -1, -1, 1, 1, 2, 2};
        int target = 0;
        List<List<Integer>> actual = this.fourSum.fourSum(nums, target);
        int expected = 2;
        Assert.assertEquals(expected, actual.size());

    }


}
