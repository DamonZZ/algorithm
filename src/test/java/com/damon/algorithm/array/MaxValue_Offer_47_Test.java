package com.damon.algorithm.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaxValue_Offer_47_Test {

    private MaxValue_Offer_47 maxValue_offer_47;

    @Before
    public void before() {
        this.maxValue_offer_47 = new MaxValue_Offer_47();
    }

    @Test
    public void maxValueTest() {
        int[][] testNums = new int[][]{
                new int[]{1, 3, 1},
                new int[]{1, 5, 1},
                new int[]{4, 2, 1}
        };
        int result = this.maxValue_offer_47.maxValue(testNums);
        Assert.assertEquals(12, result);
    }
}
