package com.damon.algorithm.greedy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaxProfit_Hot100_121_Test {

    private MaxProfit_Hot100_121 maxProfit_hot100_121;

    @Before
    public void before() {
        this.maxProfit_hot100_121 = new MaxProfit_Hot100_121();
    }


    @Test
    public void maxProfitTest() {
        int[] nums = new int[]{7, 1, 5, 3, 6, 4};
        int ans = this.maxProfit_hot100_121.maxProfit(nums);
        Assert.assertEquals(5, ans);
    }


}
