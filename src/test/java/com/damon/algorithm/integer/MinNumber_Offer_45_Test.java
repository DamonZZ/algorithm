package com.damon.algorithm.integer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MinNumber_Offer_45_Test {

    private MinNumber_Offer_45 minNumber_offer_45;

    @Before
    public void before() {
        this.minNumber_offer_45 = new MinNumber_Offer_45();
    }

    @Test
    public void minNumberTest() {
        int[] testNums = new int[]{4, 2, 33, 1};
        String res = this.minNumber_offer_45.minNumber(testNums);
        Assert.assertTrue(res.equalsIgnoreCase("12334"));
    }

}
