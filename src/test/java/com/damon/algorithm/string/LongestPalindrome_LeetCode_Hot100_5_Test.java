package com.damon.algorithm.string;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LongestPalindrome_LeetCode_Hot100_5_Test {

    private LongestPalindrome_LeetCode_Hot100_5 longestPalindrome;

    @Before
    public void before() {
        this.longestPalindrome = new LongestPalindrome_LeetCode_Hot100_5();
    }


    @Test
    public void longestPalindromeTest() {
        String test = "bb";
        String reuslt = this.longestPalindrome.longestPalindrome(test);
        int expected = 2;
        Assert.assertEquals(expected, reuslt.length());

        test = "ac";
        reuslt = this.longestPalindrome.longestPalindrome(test);
        expected = 1;
        Assert.assertEquals(expected, reuslt.length());
    }

}
