package com.damon.algorithm.binary;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Search_Hot100_33_Test {

    private Search_Hot100_33 search_hot100_33;

    @Before
    public void before() {
        this.search_hot100_33 = new Search_Hot100_33();
    }

    @Test
    public void searchRangeTest() {
        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        int ans = this.search_hot100_33.search(nums, 0);
        Assert.assertEquals(4, ans);
    }

}
