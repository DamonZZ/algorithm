package com.damon.algorithm.string;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FirstUniqChar_Offer50_Test {

    private FirstUniqChar_Offer50 firstUniqChar_offer50;

    @Before
    public void before() {
        this.firstUniqChar_offer50 = new FirstUniqChar_Offer50();
    }

    @Test
    public void firstUniqCharTest() {
        String testStr = "abaccdeff";
        char result = this.firstUniqChar_offer50.firstUniqChar(testStr);
        Assert.assertEquals('b', result);
    }

}
