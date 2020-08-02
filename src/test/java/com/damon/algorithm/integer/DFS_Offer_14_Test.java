package com.damon.algorithm.integer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DFS_Offer_14_Test {

    private DFS_Offer_14 dfs_offer_14;

    @Before
    public void before() {
        this.dfs_offer_14 = new DFS_Offer_14();
    }

    @Test
    public void cuttingRopeTest() {
        int result = this.dfs_offer_14.cuttingRope(10);
        Assert.assertEquals(36, result);
    }


}
