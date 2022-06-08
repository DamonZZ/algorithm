package com.damon.algorithm.integer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RomanToInt_LeetCode_Hot100_13_Test {

    private RomanToInt_LeetCode_Hot100_13 romanToInt;

    @Before
    public void before() {
        this.romanToInt = new RomanToInt_LeetCode_Hot100_13();
    }

    @Test
    public void romanToIntTest() {
        int expected = 1994;
        String testRoman = "MCMXCIV";
        int result = this.romanToInt.romanToInt(testRoman);
        Assert.assertEquals(expected, result);
    }

}
