package com.damon.algorithm.stack;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StackTest {

    private Stack stack;

    @Before
    public void before() {
        this.stack = new Stack();
    }

    @After
    public void after() {
        this.stack = null;
    }

    @Test
    public void IsPopOrderTest() {

        int[] pushOrder = new int[]{1, 2, 3, 4, 5};
        int[] popOrder = new int[]{4, 5, 3, 2, 1};

        boolean expected = true;
        boolean result = this.stack.IsPopOrder(pushOrder, popOrder);
        Assert.assertEquals(expected, result);

        popOrder = new int[]{4, 3, 5, 1, 2};
        expected = false;
        result = this.stack.IsPopOrder(pushOrder, popOrder);
        Assert.assertEquals(expected, result);
    }

}
