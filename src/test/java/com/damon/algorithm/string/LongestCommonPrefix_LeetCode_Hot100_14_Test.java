package com.damon.algorithm.string;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LongestCommonPrefix_LeetCode_Hot100_14_Test {


    private LongestCommonPrefix_LeetCode_Hot100_14 longestCommonPrefix;

    @Before
    public void before() {
        this.longestCommonPrefix = new LongestCommonPrefix_LeetCode_Hot100_14();
    }


    @Test
    public void longestCommonPrefixTest() {
        String[] strs = new String[]{"flower", "flow", "flight"};
        String expected = "fl";
        String result = this.longestCommonPrefix.longestCommonPrefix(strs);
        Assert.assertTrue(expected.equals(result));

    }

}
