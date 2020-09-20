package com.damon.algorithm.integer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindNthDigit_Offer_44_Test {

    private FindNthDigit_Offer_44 findNthDigit_offer_44;

    @Before
    public void before() {
        this.findNthDigit_offer_44 = new FindNthDigit_Offer_44();
    }

    @Test
    public void findNthDigitTest() {
        int res = this.findNthDigit_offer_44.findNthDigit(11);
        Assert.assertEquals(0, res);
    }

}
