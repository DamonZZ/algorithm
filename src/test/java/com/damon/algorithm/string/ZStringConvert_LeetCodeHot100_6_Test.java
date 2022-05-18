package com.damon.algorithm.string;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ZStringConvert_LeetCodeHot100_6_Test {

    private ZStringConvert_LeetCodeHot100_6 zStringConvert;

    @Before
    public void before() {
        this.zStringConvert = new ZStringConvert_LeetCodeHot100_6();
    }

    @Test
    public void convertTest() {
        String test = "PAYPALISHIRING";
        int row = 3;
        String expected = "PAHNAPLSIIGYIR";
        String result = this.zStringConvert.convert(test, row);
        Assert.assertTrue(expected.equalsIgnoreCase(result));
    }

}
