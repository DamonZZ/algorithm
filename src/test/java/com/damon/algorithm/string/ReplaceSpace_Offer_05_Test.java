package com.damon.algorithm.string;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReplaceSpace_Offer_05_Test {

    private ReplaceSpace_Offer_05 replaceSpace;

    private String testString = "We are happy";

    private String expectString = "We%20are%20happy";

    @Before
    public void before() {
        this.replaceSpace = new ReplaceSpace_Offer_05();
    }

    @Test
    public void ReplaceSpaceTest() {
        String result = this.replaceSpace.replaceSpace(this.testString);
        Assert.assertEquals(this.expectString, result);
    }

}
