package com.damon.algorithm.binary;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Binary_Offer_15Test {

    private Binary_Offer_15 binaryOffer15;

    @Before
    public void before(){
        this.binaryOffer15 = new Binary_Offer_15();
    }

    @After
    public void after(){
        this.binaryOffer15 = null;
    }

    @Test
    public void getOneNumbersMethod1Test(){
        int testInt = 3;

        int expected = 2;
        int actual = this.binaryOffer15.getOneNumbersMethod1(testInt);
        Assert.assertEquals(expected,actual);

//        testInt = -3;
//        expected = 3;
//        actual = this.binaryOffer15.getOneNumbersMethod1(testInt);
//        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getOneNumbersMethod2Test(){
        int testInt = 3;

        int expected = 2;
        int actual = this.binaryOffer15.getOneNumbersMethod2(testInt);
        Assert.assertEquals(expected,actual);

//        testInt = -3;
//        expected = 3;
//        actual = this.binaryOffer15.getOneNumbersMethod2(testInt);
//        Assert.assertEquals(expected,actual);
    }
}
