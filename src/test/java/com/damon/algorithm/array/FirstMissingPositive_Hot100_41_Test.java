package com.damon.algorithm.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FirstMissingPositive_Hot100_41_Test {

    private FirstMissingPositive_Hot100_41 firstMissingPositive_hot100_41;

    @Before
    public void before() {
        this.firstMissingPositive_hot100_41 = new FirstMissingPositive_Hot100_41();
    }

    @Test
    public void getLeastNumbersTest() {
        int[] testArr = new int[]{3, 4, -1, 1};
        int res = this.firstMissingPositive_hot100_41.firstMissingPositive(testArr);
        Assert.assertEquals(2, res);
    }

}
