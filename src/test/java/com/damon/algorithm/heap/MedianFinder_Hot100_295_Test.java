package com.damon.algorithm.heap;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MedianFinder_Hot100_295_Test {


    private MedianFinder_Hot100_295 medianFinder_hot100_295;

    @Before
    public void before() {
        this.medianFinder_hot100_295 = new MedianFinder_Hot100_295();
    }


    @Test
    public void medianFinderTest() {
        this.medianFinder_hot100_295.addNum(1);
        this.medianFinder_hot100_295.addNum(2);
        this.medianFinder_hot100_295.addNum(3);
        double ans = this.medianFinder_hot100_295.findMedian();
        Assert.assertEquals(2.0, ans, 0.01);
    }

}
