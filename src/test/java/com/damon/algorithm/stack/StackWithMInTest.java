package com.damon.algorithm.stack;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StackWithMInTest {

    private StackWithMin stackWithMin;

    @Before
    public void before() {
        this.stackWithMin = new StackWithMin();
    }

    @After
    public void after() {
        this.stackWithMin = null;
    }

    @Test
    public void minTest() {
        int result = 0;
        int expected = 5;

        this.stackWithMin.push(5);

        result = this.stackWithMin.min();
        Assert.assertEquals(expected, result);

        this.stackWithMin.push(6);
        result = this.stackWithMin.min();
        Assert.assertEquals(expected, result);

        expected = 4;
        this.stackWithMin.push(4);
        result = this.stackWithMin.min();
        Assert.assertEquals(expected, result);

        expected = 5;
        this.stackWithMin.pop();
        result = this.stackWithMin.min();
        Assert.assertEquals(expected, result);
    }

}
