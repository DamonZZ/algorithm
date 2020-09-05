package com.damon.algorithm.stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VerifyPostorder_Offer_33_Test {

    private VerifyPostorder_Offer_33 verifyPostorder_offer_33;

    private int[] testPostOrder;

    @Before
    public void before() {
        this.verifyPostorder_offer_33 = new VerifyPostorder_Offer_33();
        this.testPostOrder = new int[]{
                1, 3, 2, 6,5
        };
    }

    @Test
    public void verifyPostorderTest() {
        boolean result = this.verifyPostorder_offer_33.verifyPostorder(this.testPostOrder);
        Assert.assertEquals(true, result);
    }

    @Test
    public void verifyPostorder2Test() {
        boolean result = this.verifyPostorder_offer_33.verifyPostorder2(this.testPostOrder);
        Assert.assertEquals(true, result);
    }
}
