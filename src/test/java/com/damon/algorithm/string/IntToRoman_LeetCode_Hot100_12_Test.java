package com.damon.algorithm.string;

import com.damon.algorithm.integer.IntToRoman_LeetCode_Hot100_12;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntToRoman_LeetCode_Hot100_12_Test {

    private IntToRoman_LeetCode_Hot100_12 intToRoman;

    @Before
    public void before() {
        this.intToRoman = new IntToRoman_LeetCode_Hot100_12();
    }

    @Test
    public void intToRomanTest() {
        String expected = "MCMXCIV";
        int testNum = 1994;
        String result = this.intToRoman.intToRoman(testNum);
        Assert.assertTrue(expected.equals(result));
    }

}
