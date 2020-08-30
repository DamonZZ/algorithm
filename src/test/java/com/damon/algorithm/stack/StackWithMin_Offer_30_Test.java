package com.damon.algorithm.stack;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StackWithMin_Offer_30_Test {

    private StackWithMin_Offer_30 stackWithMinOffer30;

    @Before
    public void before() {
        this.stackWithMinOffer30 = new StackWithMin_Offer_30();
    }

    @After
    public void after() {
        this.stackWithMinOffer30 = null;
    }

    @Test
    public void minTest() {
        int result = 0;
        int expected = 5;

        this.stackWithMinOffer30.push(5);

        result = this.stackWithMinOffer30.min();
        Assert.assertEquals(expected, result);

        this.stackWithMinOffer30.push(6);
        result = this.stackWithMinOffer30.min();
        Assert.assertEquals(expected, result);

        expected = 4;
        this.stackWithMinOffer30.push(4);
        result = this.stackWithMinOffer30.min();
        Assert.assertEquals(expected, result);

        expected = 5;
        this.stackWithMinOffer30.pop();
        result = this.stackWithMinOffer30.min();
        Assert.assertEquals(expected, result);
    }

}
