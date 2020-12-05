package com.damon.algorithm.integer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Add_Offer_65_Test {

    private Add_Offer_65 add_offer_65;

    @Before
    public void before() {
        this.add_offer_65 = new Add_Offer_65();
    }

    @Test
    public void addTest() {
        int res = this.add_offer_65.add(1, 1);
        Assert.assertEquals(2, res);
    }

}
