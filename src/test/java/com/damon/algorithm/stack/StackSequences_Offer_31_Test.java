package com.damon.algorithm.stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StackSequences_Offer_31_Test {

    private StackSequences_Offer_31 stackSequences_offer_31;

    @Before
    public void before() {
        this.stackSequences_offer_31 = new StackSequences_Offer_31();
    }

    @Test
    public void validateStackSequencesTest() {
        int[] pushed = new int[]{1, 2, 3, 4, 5};
        int[] poped = new int[]{4, 5, 3, 2, 1};
        boolean result = this.stackSequences_offer_31.validateStackSequences(pushed, poped);
        Assert.assertEquals(result, true);
    }

}
