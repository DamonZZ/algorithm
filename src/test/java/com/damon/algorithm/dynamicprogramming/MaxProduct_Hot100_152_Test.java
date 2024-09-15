package com.damon.algorithm.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

public class MaxProduct_Hot100_152_Test {

    private MaxProduct_Hot100_152 maxProduct_hot100_152 = new MaxProduct_Hot100_152();

    @Test
    public void maxProductTest() {
        int[] nums = new int[]{2,3,-2,4};
        int ans = this.maxProduct_hot100_152.maxProduct(nums);
        Assert.assertEquals(6, ans);
    }

}
