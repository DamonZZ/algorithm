package com.damon.algorithm.stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MinStack_Test {

    private MinStack minStack;

    @Before
    public void before() {
        this.minStack = new MinStack();
    }


    @Test
    public void IsPopOrderTest() {

        this.minStack.push(-2);
        this.minStack.push(0);
        this.minStack.push(-3);

        Assert.assertEquals(-3,this.minStack.getMin());
    }

}
