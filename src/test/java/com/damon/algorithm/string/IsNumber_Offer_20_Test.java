package com.damon.algorithm.string;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IsNumber_Offer_20_Test {

    private IsNumber_Offer_20 isNumber_offer_20;

    @Before
    public void before() {
        this.isNumber_offer_20 = new IsNumber_Offer_20();
    }

    @Test
    public void isNumberTest() {
        String testNumber = "1 ";
        boolean result = this.isNumber_offer_20.isNumber(testNumber);
        Assert.assertEquals(true, result);
    }

}
