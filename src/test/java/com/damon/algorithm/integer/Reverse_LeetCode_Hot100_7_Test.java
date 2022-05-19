package com.damon.algorithm.integer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Reverse_LeetCode_Hot100_7_Test {

    private Reverse_LeetCode_Hot100_7 reverse_leetCode;

    @Before
    public void before() {
        this.reverse_leetCode = new Reverse_LeetCode_Hot100_7();
    }

    @Test
    public void reverseTest() {
        int test = 123;
        int result = this.reverse_leetCode.reverse(test);
        int expected = 321;
        Assert.assertEquals(expected, result);

        test = -123;
        result = this.reverse_leetCode.reverse(test);
        expected = -321;
        Assert.assertEquals(expected, result);
    }

}
