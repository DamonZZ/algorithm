package com.damon.algorithm.skils;

import org.junit.Assert;
import org.junit.Test;

public class NextPermutation_Hot100_31_Test {

    private NextPermutation_Hot100_31 nextPermutation_hot100_31 = new NextPermutation_Hot100_31();


    @Test
    public void majorityElementTest() {
        int[] nums = new int[]{1, 3, 2};
        this.nextPermutation_hot100_31.nextPermutation(nums);
        Assert.assertEquals(3, nums[nums.length - 1]);
    }

}
