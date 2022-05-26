package com.damon.algorithm.string;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IsMatch_LeetCode_Hot100_10_Test {

    private IsMatch_LeetCode_Hot100_10 isMatch;

    @Before
    public void before() {
        this.isMatch = new IsMatch_LeetCode_Hot100_10();
    }

    @Test
    public void isMatchTest() {
        String s = "aasdfasdfasdfasdfas";
        String p = "aasdf.*asdf.*asdf.*asdf.*s";
        boolean expected = true;
        boolean result = this.isMatch.isMatch(s, p);


        Assert.assertEquals(expected, result);
    }


}
