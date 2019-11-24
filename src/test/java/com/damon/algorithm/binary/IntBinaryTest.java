package com.damon.algorithm.binary;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntBinaryTest {

    private IntBinary intBinary;

    @Before
    public void before(){
        this.intBinary = new IntBinary();
    }

    @After
    public void after(){
        this.intBinary = null;
    }

    @Test
    public void getOneNumbersMethod1Test(){
        int testInt = 3;

        int expected = 2;
        int actual = this.intBinary.getOneNumbersMethod1(testInt);
        Assert.assertEquals(expected,actual);

//        testInt = -3;
//        expected = 3;
//        actual = this.intBinary.getOneNumbersMethod1(testInt);
//        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getOneNumbersMethod2Test(){
        int testInt = 3;

        int expected = 2;
        int actual = this.intBinary.getOneNumbersMethod2(testInt);
        Assert.assertEquals(expected,actual);

//        testInt = -3;
//        expected = 3;
//        actual = this.intBinary.getOneNumbersMethod2(testInt);
//        Assert.assertEquals(expected,actual);
    }
}
