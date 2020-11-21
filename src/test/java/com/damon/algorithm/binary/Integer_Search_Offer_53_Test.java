package com.damon.algorithm.binary;

import com.damon.algorithm.array.Integer_Search_Offer_53;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Integer_Search_Offer_53_Test {

    private Integer_Search_Offer_53 integer_search_offer_53;

    @Before
    public void before() {
        this.integer_search_offer_53 = new Integer_Search_Offer_53();
    }

    @Test
    public void searchTest() {
        int[] testArry = new int[]{5, 7, 7, 8, 8, 10};
        int result = this.integer_search_offer_53.search(testArry, 8);
        Assert.assertEquals(2, result);
    }

    @Test
    public void missingNumberTest() {
        int[] testArry = new int[]{0, 1, 3};
        int result = this.integer_search_offer_53.missingNumber(testArry);
        Assert.assertEquals(2, result);
    }

}
