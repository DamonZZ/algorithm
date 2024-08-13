package com.damon.algorithm.graph;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OrangesRotting_Hot100_994_Test {

    private OrangesRotting_Hot100_994 orangesRotting_hot100_994;

    @Before
    public void  before(){
        this.orangesRotting_hot100_994 = new OrangesRotting_Hot100_994();
    }

    @Test
    public void numIslandsTest(){
        int[][] grid = new int[3][3];
        grid[0] = new int[]{2,1,1};
        grid[1] = new int[]{1,1,0};
        grid[2] = new int[]{0,1,1};

        int ans = this.orangesRotting_hot100_994.orangesRotting(grid);
        Assert.assertEquals(4,ans);
    }

}
