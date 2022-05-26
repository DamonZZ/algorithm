package com.damon.algorithm.integer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IsPalindrome_LeetCode_Hot100_9_Test {

    private IsPalindrome_LeetCode_Hot100_9 isPalindrome;

    @Before
    public void before() {
        this.isPalindrome = new IsPalindrome_LeetCode_Hot100_9();
    }

    @Test
    public void isPalindromeTest() {
        int test = 12321;
        boolean expected = true;
        boolean result = this.isPalindrome.isPalindrome(test);
        Assert.assertEquals(expected, result);

        test = -123321;
        expected = false;
        result = this.isPalindrome.isPalindrome(test);
        Assert.assertEquals(expected, result);

    }

}
