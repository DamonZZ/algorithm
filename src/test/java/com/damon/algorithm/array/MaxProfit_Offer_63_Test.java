package com.damon.algorithm.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaxProfit_Offer_63_Test {

    private MaxProfit_Offer_63 maxProfit_offer_63;

    @Before
    public void before() {
        this.maxProfit_offer_63 = new MaxProfit_Offer_63();
    }

    @Test
    public void maxProfit() {
        int[] testPrices = new int[]{7, 1, 5, 3, 6, 4};
        int res = this.maxProfit_offer_63.maxProfit(testPrices);
        Assert.assertEquals(5, res);
    }

}
