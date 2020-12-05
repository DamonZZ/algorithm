package com.damon.algorithm.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IsStraight_Offer_62_Test {

    private IsStraight_Offer_62 isStraight_offer_62;

    @Before
    public void before() {
        this.isStraight_offer_62 = new IsStraight_Offer_62();
    }

    @Test
    public void isStraightTest() {
        int[] testNums = new int[]{1, 2, 0, 5, 0};
        boolean res = this.isStraight_offer_62.isStraight(testNums);
        Assert.assertTrue(res);
    }

}
