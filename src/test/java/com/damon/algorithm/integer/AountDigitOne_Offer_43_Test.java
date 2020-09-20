package com.damon.algorithm.integer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AountDigitOne_Offer_43_Test {

    private AountDigitOne_Offer_43 aountDigitOne_offer_43;

    @Before
    public void before() {
        this.aountDigitOne_offer_43 = new AountDigitOne_Offer_43();
    }

    @Test
    public void countDigitOneTest() {
        int res = this.aountDigitOne_offer_43.countDigitOne(12);

        Assert.assertEquals(5, res);
    }


}
