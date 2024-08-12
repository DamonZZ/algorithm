package com.damon.algorithm.graph;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumIslands_Hot100_200_Test {
    private NumIslands_Hot100_200 numIslands_hot100_200;

    @Before
    public void  before(){
        this.numIslands_hot100_200 = new NumIslands_Hot100_200();
    }

    @Test
    public void numIslandsTest(){
        char[][] grid = new char[4][5];
        grid[0] = new char[]{'1','1','1','1','0'};
        grid[1] = new char[]{'1','1','0','1','0'};
        grid[2] = new char[]{'1','1','0','0','0'};
        grid[3] = new char[]{'0','0','0','0','0'};
        int ans = this.numIslands_hot100_200.numIslands(grid);
        Assert.assertEquals(1,ans);
    }

}
