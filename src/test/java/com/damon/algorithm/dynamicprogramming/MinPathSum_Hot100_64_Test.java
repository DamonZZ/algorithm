package com.damon.algorithm.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

public class MinPathSum_Hot100_64_Test {


    private MinPathSum_Hot100_64 minPathSum_hot100_64 = new MinPathSum_Hot100_64();

    @Test
    public void minPathSumTest() {
        int[][] grid = new int[3][3];
        grid[0] = new int[]{1, 3, 1};
        grid[1] = new int[]{1, 5, 1};
        grid[2] = new int[]{4, 2, 1};
        int ans = this.minPathSum_hot100_64.minPathSum(grid);
        Assert.assertEquals(7, ans);
    }
}
