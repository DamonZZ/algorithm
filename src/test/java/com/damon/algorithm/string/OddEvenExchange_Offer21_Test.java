package com.damon.algorithm.string;

import com.damon.algorithm.array.OddEvenExchange_Offer21;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OddEvenExchange_Offer21_Test {

    private OddEvenExchange_Offer21 oddEvenExchange_offer21;

    @Before
    public void before() {
        this.oddEvenExchange_offer21 = new OddEvenExchange_Offer21();
    }

    @Test
    public void exchangeTest() {
        int[] nums = new int[]{1, 2, 3, 4};
        int[] result = this.oddEvenExchange_offer21.exchange(nums);
        Assert.assertEquals(3, result[1]);
    }


}
