package com.damon.algorithm.integer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ThreeSumClosest_LeetCode_Hot100_16_Test {

    private ThreeSumClosest_LeetCode_Hot100_16 threeSumClosest;

    @Before
    public void before() {
        this.threeSumClosest = new ThreeSumClosest_LeetCode_Hot100_16();
    }

    @Test
    public void threeSumClosestTest() {
        int[] nums = new int[]{-1, 2, 1, -4};
        int target = 1;
        int expected = 2;
        int result = this.threeSumClosest.threeSumClosest(nums, target);
        Assert.assertEquals(expected, result);
    }

}
