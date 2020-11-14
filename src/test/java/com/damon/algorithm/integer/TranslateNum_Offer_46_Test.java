package com.damon.algorithm.integer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TranslateNum_Offer_46_Test {

    private TranslateNum_Offer_46 translateNum_offer_46;

    @Before
    public void before() {
        this.translateNum_offer_46 = new TranslateNum_Offer_46();
    }

    @Test
    public void translateNumTest() {
        int testNum = 12258;
        int result = this.translateNum_offer_46.translateNum(testNum);
        Assert.assertEquals(5, result);
    }

}
