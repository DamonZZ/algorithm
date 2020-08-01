package com.damon.algorithm.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MinArray_Offer_11_Test {

    private MinArray_Offer_11 minArray_offer_11;

    private int[] testArray = new int[]{4, 5, 6, 2, 2, 3};

    @Before
    public void before() {
        this.minArray_offer_11 = new MinArray_Offer_11();
    }

    @Test
    public void minArrayTest() {
        int result = this.minArray_offer_11.minArray(this.testArray);
        Assert.assertEquals(2, result);
    }

}
