package com.damon.algorithm.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

public class Rob_Hot100_198_Test {


    private Rob_Hot100_198 rob_hot100_198 = new Rob_Hot100_198();

    @Test
    public void robTest() {
        int[] nums = new int[]{1, 2, 3, 1};
        int ans = this.rob_hot100_198.rob(nums);
        Assert.assertEquals(4, ans);
    }

}
