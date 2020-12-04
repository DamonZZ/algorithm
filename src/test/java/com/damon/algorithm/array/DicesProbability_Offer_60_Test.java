package com.damon.algorithm.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DicesProbability_Offer_60_Test {

    public DicesProbability_Offer_60 dicesProbability_offer_60;

    @Before
    public void before() {
        this.dicesProbability_offer_60 = new DicesProbability_Offer_60();
    }

    @Test
    public void dicesProbabilityTest() {
        int count = 3;
        double[] res = this.dicesProbability_offer_60.dicesProbability(count);
        Assert.assertTrue(res.length > 0);
    }

}
