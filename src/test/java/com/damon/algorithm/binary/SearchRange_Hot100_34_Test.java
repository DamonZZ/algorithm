package com.damon.algorithm.binary;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SearchRange_Hot100_34_Test {

    private SearchRange_Hot100_34 searchRange_hot100_34;

    @Before
    public void before() {
        this.searchRange_hot100_34 = new SearchRange_Hot100_34();
    }

    @Test
    public void searchRangeTest() {
        int[] nums = new int[]{5, 7, 7, 8, 8, 10};
        int[] ans = this.searchRange_hot100_34.searchRange(nums, 8);
        Assert.assertEquals(3, ans[0]);
        Assert.assertEquals(4, ans[1]);
    }

}
