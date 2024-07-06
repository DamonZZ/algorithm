package com.damon.algorithm.pointer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MinWindow_Hot100_76_Test {

    private MinWindow_Hot100_76 minWindow;

    @Before
    public void before() {
        this.minWindow = new MinWindow_Hot100_76();
    }

    @Test
    public void findAnagramsTest() {
        String ans = this.minWindow.minWindow("ADOBECODEBANC", "ABC");
        Assert.assertEquals("BANC", ans);
    }

}
