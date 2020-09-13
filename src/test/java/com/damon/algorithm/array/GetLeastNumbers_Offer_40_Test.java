package com.damon.algorithm.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GetLeastNumbers_Offer_40_Test {

    private GetLeastNumbers_Offer_40 getLeastNumbers_offer_40;

    @Before
    public void before() {
        this.getLeastNumbers_offer_40 = new GetLeastNumbers_Offer_40();
    }

    @Test
    public void getLeastNumbersTest() {
        int[] testArr = new int[]{3, 2, 1};
        int[] res = this.getLeastNumbers_offer_40.getLeastNumbers(testArr, 2);
        Assert.assertEquals(2, res.length);
    }

}
