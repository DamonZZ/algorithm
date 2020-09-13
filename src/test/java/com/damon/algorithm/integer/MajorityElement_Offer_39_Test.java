package com.damon.algorithm.integer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MajorityElement_Offer_39_Test {

    private MajorityElement_Offer_39 majorityElement_offer_39;

    @Before
    public void before() {
        this.majorityElement_offer_39 = new MajorityElement_Offer_39();
    }

    @Test
    public void majorityElementTest() {
        int[] testNums = new int[]{1, 2, 2, 2, 2, 3, 4, 5};
        int result = this.majorityElement_offer_39.majorityElement(testNums);
        Assert.assertEquals(2, result);
    }

}
