package com.damon.algorithm.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

public class CoinChange_Hot100_322_Test {

    private CoinChange_Hot100_322 coinChange_hot100_322 = new CoinChange_Hot100_322();

    @Test
    public void coinChangeTest() {
        int[] nums = new int[]{1, 2, 5};
        int ans = this.coinChange_hot100_322.coinChange(nums, 11);
        Assert.assertEquals(3, ans);
    }

}
