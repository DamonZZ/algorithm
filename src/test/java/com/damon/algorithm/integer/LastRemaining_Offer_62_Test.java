package com.damon.algorithm.integer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LastRemaining_Offer_62_Test {

    private LastRemaining_Offer_62 lastRemaining_offer_62;

    @Before
    public void before() {
        this.lastRemaining_offer_62 = new LastRemaining_Offer_62();
    }

    @Test
    public void lastRemainingTest() {
        int res = this.lastRemaining_offer_62.lastRemaining(5, 3);
        Assert.assertEquals(3, res);
    }

}
