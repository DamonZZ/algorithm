package com.damon.algorithm.skils;

import org.junit.Assert;
import org.junit.Test;

public class SortColors_Hot100_75_Test {

    private SortColors_Hot100_75 sortColors_hot100_75 = new SortColors_Hot100_75();


    @Test
    public void sortColorsTest() {
        int[] nums = new int[]{2, 0, 2, 1, 1, 0};
        this.sortColors_hot100_75.sortColors(nums);
        Assert.assertEquals(2, nums[nums.length - 1]);
    }

}
