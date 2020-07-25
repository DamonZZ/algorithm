package com.damon.algorithm.stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CQueue_Offer_09_Test {

    private CQueue_Offer_09 cQueue;

    @Before
    public void before() {
        this.cQueue = new CQueue_Offer_09();
    }

    @Test
    public void appendDeleteTest() {
        this.cQueue.appendTail(1);
        this.cQueue.appendTail(3);
        this.cQueue.deleteHead();
        this.cQueue.appendTail(5);
        this.cQueue.appendTail(1);
        Assert.assertEquals(3, this.cQueue.deleteHead());
    }

}
