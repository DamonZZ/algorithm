package com.damon.algorithm.matrix;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SearchMatrix_Hot100_240_Test {


    private SearchMatrix_Hot100_240 searchMatrix_hot100_240;

    @Before
    public void before() {
        this.searchMatrix_hot100_240 = new SearchMatrix_Hot100_240();
    }

    @Test
    public void searchMatrixTest() {
        int[][] nums = new int[3][3];
        nums[0] = new int[]{1, 2, 3};
        nums[1] = new int[]{4, 5, 6};
        nums[2] = new int[]{7, 8, 9};
        boolean ans = this.searchMatrix_hot100_240.searchMatrix(nums, 5);
        Assert.assertEquals(true, ans);
    }

}
