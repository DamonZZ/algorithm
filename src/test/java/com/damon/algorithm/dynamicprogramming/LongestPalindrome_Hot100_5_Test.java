package com.damon.algorithm.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

public class LongestPalindrome_Hot100_5_Test {

    private LongestPalindrome_Hot100_5 longestPalindrome_hot100_5 = new LongestPalindrome_Hot100_5();

    @Test
    public void longestPalindromeTest() {
        String ans = this.longestPalindrome_hot100_5.longestPalindrome("babad");
        Assert.assertEquals("bab", ans);
    }

}
