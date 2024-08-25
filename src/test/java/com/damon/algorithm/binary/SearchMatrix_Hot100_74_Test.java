package com.damon.algorithm.binary;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SearchMatrix_Hot100_74_Test {

    private SearchMatrix_Hot100_74 searchMatrix_hot100_74;

    @Before
    public void before() {
        this.searchMatrix_hot100_74 = new SearchMatrix_Hot100_74();
    }


    @Test
    public void searchMatrixTest() {
        int[][] nums = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        boolean ans = this.searchMatrix_hot100_74.searchMatrix(nums, 3);
        Assert.assertEquals(true, ans);
    }

}
