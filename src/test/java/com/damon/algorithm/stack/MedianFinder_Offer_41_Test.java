package com.damon.algorithm.stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MedianFinder_Offer_41_Test {

    private MedianFinder_Offer_41 medianFinder_offer_41;

    @Before
    public void before() {
        this.medianFinder_offer_41 = new MedianFinder_Offer_41();
    }

    @Test
    public void findMedianTest() {
        this.medianFinder_offer_41.addNum(6);
        this.medianFinder_offer_41.addNum(3);
        this.medianFinder_offer_41.addNum(8);
        Assert.assertEquals(6, this.medianFinder_offer_41.findMedian(), 0.01);
    }

}
