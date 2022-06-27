package com.damon.algorithm.string;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IsValid_LeetCode_Hot100_20_Test {

    private IsValid_LeetCode_Hot100_20 isValid;

    @Before
    public void before() {
        this.isValid = new IsValid_LeetCode_Hot100_20();
    }

    @Test
    public void isValid() {
        String testStr = "(])";
        boolean expected = false;
        boolean actual = this.isValid.isValid(testStr);
        Assert.assertEquals(expected, actual);

    }

}
