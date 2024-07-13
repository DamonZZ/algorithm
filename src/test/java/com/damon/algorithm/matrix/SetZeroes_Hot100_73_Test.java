package com.damon.algorithm.matrix;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SetZeroes_Hot100_73_Test {


    private SetZeroes_Hot100_73 setZeroes_hot100_73;

    @Before
    public void before() {
        this.setZeroes_hot100_73 = new SetZeroes_Hot100_73();
    }

    @Test
    public void setZeroesTest() {
        int[][] nums = new int[3][3];
        nums[0] = new int[]{1, 1, 1};
        nums[1] = new int[]{1, 0, 1};
        nums[2] = new int[]{1, 1, 1};
        this.setZeroes_hot100_73.setZeroes(nums);
        Assert.assertEquals(0, nums[0][1]);
    }

}
