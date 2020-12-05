package com.damon.algorithm.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConstructArr_Offer_66_Test {

    private ConstructArr_Offer_66 constructArr_offer_66;

    @Before
    public void before() {
        this.constructArr_offer_66 = new ConstructArr_Offer_66();
    }

    @Test
    public void constructArr() {
        int[] testNum = new int[]{1, 2, 3, 4, 5};
        int[] res = this.constructArr_offer_66.constructArr(testNum);
        Assert.assertEquals(5, res.length);
    }
}
