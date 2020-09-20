package com.damon.algorithm.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaxSubArray_Offer_42_Test {

    private MaxSubArray_Offer_42 maxSubArray_offer_42;

    @Before
    public void before() {
        this.maxSubArray_offer_42 = new MaxSubArray_Offer_42();
    }

    @Test
    public void maxSubArrayTest() {
        int[] testNums = new int[]{1, -2, 3, 4, -2, 5};
        Assert.assertEquals(10, this.maxSubArray_offer_42.maxSubArray(testNums));
    }

}
