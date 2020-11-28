package com.damon.algorithm.integer;

import com.damon.algorithm.array.SingleNumbers_Offer_56;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SingleNumbers_Offer_56_Test {

    private SingleNumbers_Offer_56 singleNumbers_offer_56;

    @Before
    public void before() {
        this.singleNumbers_offer_56 = new SingleNumbers_Offer_56();
    }

    @Test
    public void singleNumbersTest() {
        int[] testNums = new int[]{1, 2, 3, 4, 1, 2, 3, 6};
        int[] res = this.singleNumbers_offer_56.singleNumbers(testNums);
        Assert.assertTrue(res.length == 2);
    }

    @Test
    public void singleNumbers2Test() {
        int[] testNums = new int[]{1, 2, 2, 2, 3, 3, 3};
        int res = this.singleNumbers_offer_56.singleNumbers2(testNums);
        Assert.assertEquals(1, res);
    }

}
