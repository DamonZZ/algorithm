package com.damon.algorithm.stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LargestRectangleArea_Hot100_84_Test {

    private LargestRectangleArea_Hot100_84 largestRectangleArea_hot100_84;

    @Before
    public void before() {
        this.largestRectangleArea_hot100_84 = new LargestRectangleArea_Hot100_84();
    }

    @Test
    public void largestRectangleAreaTest() {
        int[] heights = new int[]{2, 1, 5, 6, 2, 3};
        int ans = this.largestRectangleArea_hot100_84.largestRectangleArea(heights);
        Assert.assertEquals(10, ans);
    }

}
