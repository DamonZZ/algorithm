package com.damon.algorithm.string;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Atoi_LeetCode_Hot100_8_Test {

    private Atoi_LeetCode_Hot100_8 atoi;

    @Before
    public void before() {
        this.atoi = new Atoi_LeetCode_Hot100_8();
    }

    @Test
    public void myAtoiTest() {
        String test = "-42";
        int expected = -42;
        int result = this.atoi.myAtoi(test);
        Assert.assertEquals(expected, result);

        test = "with words 4193";
        expected = 0;
        result = this.atoi.myAtoi(test);
        Assert.assertEquals(expected, result);
    }

}
