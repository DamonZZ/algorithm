package com.damon.algorithm.binary;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SearchInsert_Hot100_35_Test {

    private SearchInsert_Hot100_35 searchInsert_hot100_35;

    @Before
    public void before() {
        this.searchInsert_hot100_35 = new SearchInsert_Hot100_35();
    }


    @Test
    public void searchInsertTest() {
        int[] nums = new int[]{1, 3, 5, 6};
        int ans = this.searchInsert_hot100_35.searchInsert(nums, 2);
        Assert.assertEquals(1, ans);
    }

}
