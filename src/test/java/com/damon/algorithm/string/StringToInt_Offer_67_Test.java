package com.damon.algorithm.string;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringToInt_Offer_67_Test {

    private StringToInt_Offer_67 stringToInt_offer_67;

    @Before
    public void before() {
        this.stringToInt_offer_67 = new StringToInt_Offer_67();
    }

    @Test
    public void strToIntTest() {
        String testStr = "2147483646";
        int res = this.stringToInt_offer_67.strToInt(testStr);
        Assert.assertTrue(res > 0);
    }

}
