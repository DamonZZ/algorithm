package com.damon.algorithm.stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IsValid_Hot100_20_Test {

    private IsValid_Hot100_20 isValid_hot100_20;

    @Before
    public void before() {
        this.isValid_hot100_20 = new IsValid_Hot100_20();
    }

    @Test
    public void isValidTest() {
        boolean result = this.isValid_hot100_20.isValid("()[]{}");
        Assert.assertEquals(true, result);
    }

}
