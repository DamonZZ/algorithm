package com.damon.algorithm.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Rotate_Hot100_189_Test {

    private Rotate_Hot100_189 rotate_hot100_189;

    @Before
    public void before() {
        this.rotate_hot100_189 = new Rotate_Hot100_189();
    }

    @Test
    public void printNumbersTest() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        this.rotate_hot100_189.rotate(nums, 3);
        Assert.assertEquals(5, nums[0]);
    }

}
