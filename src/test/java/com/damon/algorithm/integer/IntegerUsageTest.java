package com.damon.algorithm.integer;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntegerUsageTest {

    private IntegerUsage integerUsage;

    @Before
    public void before() {
        this.integerUsage = new IntegerUsage();
    }

    @After
    public void after() {
        this.integerUsage = null;
    }

    @Test
    public void lastRemainingTest() {
        int testN = 5;
        int testM = 3;
        int expected = 3;
        int result = this.integerUsage.lastRemaining(testN, testM);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void sumTest() {
        int testN = 5;
        int expected = 15;
        int result = this.integerUsage.sum(testN);
        Assert.assertEquals(expected, result);
    }
}
