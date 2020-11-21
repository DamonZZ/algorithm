package com.damon.algorithm.integer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReversePairs_Offer_51_Test {

    private ReversePairs_Offer_51 reversePairs_offer_51;

    @Before
    public void before() {
        this.reversePairs_offer_51 = new ReversePairs_Offer_51();
    }

    @Test
    public void reversePairsTest() {
        int[] testArr = new int[]{7, 5, 6, 4};
        int result = this.reversePairs_offer_51.reversePairs(testArr);
        Assert.assertEquals(5, result);
    }
}
