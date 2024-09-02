package com.damon.algorithm.stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DecodeString_Hot100_394_Test {

    private DecodeString_Hot100_394 decodeString_hot100_394;

    @Before
    public void before() {
        this.decodeString_hot100_394 = new DecodeString_Hot100_394();
    }


    @Test
    public void decodeStringTest() {
        Assert.assertEquals("aaabcbc",this.decodeString_hot100_394.decodeString("3[a]2[bc]"));
    }


}
