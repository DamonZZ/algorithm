package com.damon.algorithm.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FibonacciOffer10Test {

    private Fibonacci_Offer_10 fibonacciOffer10;

    @Before
    public void beofore() {
        this.fibonacciOffer10 = new Fibonacci_Offer_10();
    }

    @After
    public void after() {
        this.fibonacciOffer10 = null;
    }

    @Test
    public void getTest() {

        int n = 0;
        int expected = 0;
        int actual = this.fibonacciOffer10.get(n);
        Assert.assertEquals(expected, actual);

        n = 1;
        expected = 1;
        actual = this.fibonacciOffer10.get(n);
        Assert.assertEquals(expected, actual);

        n = 7;
        expected = 13;
        actual = this.fibonacciOffer10.get(n);
        Assert.assertEquals(expected, actual);

        n = 39;
        expected = 13;
        actual = this.fibonacciOffer10.get(n);
        System.out.println(actual);

    }

}
