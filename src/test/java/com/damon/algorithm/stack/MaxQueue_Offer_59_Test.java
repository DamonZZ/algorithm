package com.damon.algorithm.stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaxQueue_Offer_59_Test {

    private MaxQueue_Offer_59 maxQueue_offer_59;

    @Before
    public void before() {
        this.maxQueue_offer_59 = new MaxQueue_Offer_59();
    }

    @Test
    public void maxQueueTest() {
        this.maxQueue_offer_59.push_back(5);
        this.maxQueue_offer_59.push_back(3);
        this.maxQueue_offer_59.push_back(6);
        Assert.assertEquals(6, this.maxQueue_offer_59.max_value());
        Assert.assertEquals(5, this.maxQueue_offer_59.pop_front());
    }

}
