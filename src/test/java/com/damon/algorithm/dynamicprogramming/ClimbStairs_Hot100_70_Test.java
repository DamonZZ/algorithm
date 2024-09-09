package com.damon.algorithm.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

public class ClimbStairs_Hot100_70_Test {

    private ClimbStairs_Hot100_70 climbStairs_hot100_70 = new ClimbStairs_Hot100_70();

    @Test
    public void climbStairsTest() {
        int ans = this.climbStairs_hot100_70.climbStairs(2);
        Assert.assertEquals(2, ans);
    }

}
