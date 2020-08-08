package com.damon.algorithm.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Permutation_Offer_17_Test {

    private Permutation_Offer_17 permutationOffer17;

    @Before
    public void before() {
        this.permutationOffer17 = new Permutation_Offer_17();
    }

    @Test
    public void printNumbersTest() {
        int[] result = this.permutationOffer17.printNumbers(2);
//        System.out.println(result);
        Assert.assertEquals(99, result.length);
    }

}
