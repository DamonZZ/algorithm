package com.damon.algorithm.binary;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindMin_Hot100_153_Test {

    private FindMin_Hot100_153 findMin_hot100_153;

    @Before
    public void before() {
        this.findMin_hot100_153 = new FindMin_Hot100_153();
    }

    @Test
    public void searchRangeTest() {
        int[] nums = new int[]{3, 4, 5, 1, 2};
        int ans = this.findMin_hot100_153.findMin(nums);
        Assert.assertEquals(1, ans);
    }

}
