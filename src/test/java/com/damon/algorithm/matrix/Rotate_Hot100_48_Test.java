package com.damon.algorithm.matrix;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Rotate_Hot100_48_Test {


    private Rotate_Hot100_48 rotate_Hot100_48;

    @Before
    public void before() {
        this.rotate_Hot100_48 = new Rotate_Hot100_48();
    }

    @Test
    public void setZeroesTest() {
        int[][] nums = new int[3][3];
        nums[0] = new int[]{1, 2, 3};
        nums[1] = new int[]{4, 5, 6};
        nums[2] = new int[]{7, 8, 9};
        this.rotate_Hot100_48.rotate(nums);
        Assert.assertEquals(7, nums[0][0]);
    }

}
