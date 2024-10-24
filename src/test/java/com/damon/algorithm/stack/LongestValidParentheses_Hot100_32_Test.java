package com.damon.algorithm.stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LongestValidParentheses_Hot100_32_Test {

    private LongestValidParentheses_Hot100_32 longestValidParentheses_hot100_32;

    @Before
    public void before() {
        this.longestValidParentheses_hot100_32 = new LongestValidParentheses_Hot100_32();
    }


    @Test
    public void longestValidParenthesesTest() {
        int ans = this.longestValidParentheses_hot100_32.longestValidParentheses(")()())");
        Assert.assertEquals(4, ans);
    }

}
