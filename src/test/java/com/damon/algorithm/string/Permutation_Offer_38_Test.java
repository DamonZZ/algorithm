package com.damon.algorithm.string;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Permutation_Offer_38_Test {

    private Permutation_Offer_38 permutation_offer_38;

    @Before
    public void before() {
        this.permutation_offer_38 = new Permutation_Offer_38();
    }

    @Test
    public void permutationTest() {
        String[] result = this.permutation_offer_38.permutation("abc");
        Assert.assertTrue(result.length == 6);
    }

}
