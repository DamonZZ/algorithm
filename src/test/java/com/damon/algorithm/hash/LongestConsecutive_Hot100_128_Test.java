package com.damon.algorithm.hash;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LongestConsecutive_Hot100_128_Test {

    private LongestConsecutive_Hot100_128 longestConsecutive;

    private int[] testArray;

    @Before
    public void before() {
        this.longestConsecutive = new LongestConsecutive_Hot100_128();
        this.testArray = new int[]{100, 4, 200, 1, 3, 2};
    }

    @Test
    public void longestConsecutiveTest() {
        int result = this.longestConsecutive.longestConsecutive(this.testArray);
        Assert.assertEquals(4, result);
    }

}
