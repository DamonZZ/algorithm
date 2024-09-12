package com.damon.algorithm.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

public class NumSquares_Hot100_279_Test {

    private NumSquares_Hot100_279 numSquares_hot100_279 = new NumSquares_Hot100_279();

    @Test
    public void numSquaresTest() {
        int ans = this.numSquares_hot100_279.numSquares(12);
        Assert.assertEquals(3, ans);
    }

}
