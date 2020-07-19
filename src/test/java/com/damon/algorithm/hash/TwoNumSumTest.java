package com.damon.algorithm.hash;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TwoNumSumTest {

    private TwoNumSum twoNumSum;

    private int[] testArray;

    @Before
    public void before() {
        this.twoNumSum = new TwoNumSum();
        this.testArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    }

    @Test
    public void twoSumTest() {
        int target = 10;
        int[] result = this.twoNumSum.twoSum(this.testArray, target);
        Assert.assertNotNull(result);
    }

}
