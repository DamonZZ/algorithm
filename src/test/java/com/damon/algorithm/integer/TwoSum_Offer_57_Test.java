package com.damon.algorithm.integer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TwoSum_Offer_57_Test {

    private TwoSum_Offer_57 twoSum_offer_57;

    @Before
    public void before() {
        this.twoSum_offer_57 = new TwoSum_Offer_57();
    }

    @Test
    public void twoSumTest() {
        int[] testNums = new int[]{1, 2, 3, 4, 5, 6};
        int target = 10;
        int[] res = this.twoSum_offer_57.twoSum(testNums, target);
        Assert.assertTrue(res.length == 2);
    }

}
