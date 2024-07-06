package com.damon.algorithm.slidingwindow;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaxSlidingWindow_Hot100_239_Test {

    private MaxSlidingWindow_Hot100_239 maxSlidingWindow;

    @Before
    public void before() {
        this.maxSlidingWindow = new MaxSlidingWindow_Hot100_239();
    }

    @Test
    public void findAnagramsTest() {
        int[] ans = this.maxSlidingWindow.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3);
        Assert.assertEquals(6, ans.length);
    }

}
