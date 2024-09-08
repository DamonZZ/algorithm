package com.damon.algorithm.greedy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Jump_Hot100_45_Test {

    private Jump_Hot100_45 jump_hot100_45;

    @Before
    public void before() {
        this.jump_hot100_45 = new Jump_Hot100_45();
    }


    @Test
    public void canJumpTest() {
        int[] nums = new int[]{2, 3, 1, 1, 4};
        int ans = this.jump_hot100_45.jump(nums);
        Assert.assertEquals(2, ans);
    }

}
