package com.damon.algorithm.greedy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CanJump_Hot100_55_Test {

    private CanJump_Hot100_55 canJump_hot100_55;

    @Before
    public void before() {
        this.canJump_hot100_55 = new CanJump_Hot100_55();
    }


    @Test
    public void canJumpTest() {
        int[] nums = new int[]{3, 2, 1, 0, 4};
        boolean ans = this.canJump_hot100_55.canJump(nums);
        Assert.assertEquals(false, ans);
    }

}
