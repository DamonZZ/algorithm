package com.damon.algorithm.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {

    private Fibonacci fibonacci;

    @Before
    public void beofore() {
        this.fibonacci = new Fibonacci();
    }

    @After
    public void after() {
        this.fibonacci = null;
    }

    @Test
    public void getTest() {

        int n = 0;
        int expected = 0;
        int actual = this.fibonacci.get(n);
        Assert.assertEquals(expected, actual);

        n = 1;
        expected = 1;
        actual = this.fibonacci.get(n);
        Assert.assertEquals(expected, actual);

        n = 7;
        expected = 13;
        actual = this.fibonacci.get(n);
        Assert.assertEquals(expected, actual);

        n = 39;
        expected = 13;
        actual = this.fibonacci.get(n);
        System.out.println(actual);

    }

}
