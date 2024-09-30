package com.damon.algorithm.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

public class MinDistance_Hot100_72_Test {

    private MinDistance_Hot100_72 minDistance_hot100_72 = new MinDistance_Hot100_72();

    @Test
    public void minDistanceTest() {
        int ans = this.minDistance_hot100_72.minDistance("horse", "ros");
        Assert.assertEquals(3, ans);
    }

}
