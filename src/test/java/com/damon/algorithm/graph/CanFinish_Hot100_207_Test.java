package com.damon.algorithm.graph;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CanFinish_Hot100_207_Test {

    private CanFinish_Hot100_207 canFinish_hot100_207;

    @Before
    public void  before(){
        this.canFinish_hot100_207 = new CanFinish_Hot100_207();
    }

    @Test
    public void canFinishTest(){
        int[][] prerequisites = new int[1][2];
        prerequisites[0] = new int[]{1,0};

        boolean ans = this.canFinish_hot100_207.canFinish(2,prerequisites);
        Assert.assertEquals(true,ans);
    }

}
