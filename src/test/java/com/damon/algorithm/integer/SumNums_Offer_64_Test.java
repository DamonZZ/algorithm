package com.damon.algorithm.integer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SumNums_Offer_64_Test {

    private SumNums_Offer_64 sumNums_offer_64;

    @Before
    public void before() {
        this.sumNums_offer_64 = new SumNums_Offer_64();
    }

    @Test
    public void sumNumsTest() {
        int res = this.sumNums_offer_64.sumNums(5);
        Assert.assertEquals(15, res);
    }

}
