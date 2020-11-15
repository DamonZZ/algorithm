package com.damon.algorithm.string;

import com.damon.algorithm.integer.UglyNumber_Offer_49;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UglyNumber_Offer_49_Test {

    private UglyNumber_Offer_49 uglyNumber_offer_49;

    @Before
    public void before() {
        this.uglyNumber_offer_49 = new UglyNumber_Offer_49();
    }

    @Test
    public void nthUglyNumberTest() {
        int testNum = 10;
        int result = this.uglyNumber_offer_49.nthUglyNumber(testNum);
        Assert.assertEquals(12, result);
    }
}
