package com.damon.algorithm.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaxSlidingWindow_Offer_59_Test {

    private MaxSlidingWindow_Offer_59 maxSlidingWindow_offer_59;

    @Before
    public void before() {
        this.maxSlidingWindow_offer_59 = new MaxSlidingWindow_Offer_59();
    }

    @Test
    public void maxSlidingWindowTest() {
        int[] testNums = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        int windowSize = 3;
        int[] res = this.maxSlidingWindow_offer_59.maxSlidingWindow(testNums, windowSize);
        Assert.assertTrue(res.length == testNums.length - windowSize + 1);
    }

}
