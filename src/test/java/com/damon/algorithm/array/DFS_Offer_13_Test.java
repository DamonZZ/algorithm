package com.damon.algorithm.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DFS_Offer_13_Test {

    private DFS_Offer_13 dfs_offer_13;


    @Before
    public void before() {
        this.dfs_offer_13 = new DFS_Offer_13();
    }

    @Test
    public void movingCountTest() {
        int result = this.dfs_offer_13.movingCount(2, 3, 1);
        Assert.assertEquals(3, result);
    }

}
