package com.damon.algorithm.subarray;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SubArraySum_Hot100_560_Test {

    private SubArraySum_Hot100_560 subArraySum;

    @Before
    public void before() {
        this.subArraySum = new SubArraySum_Hot100_560();
    }

    @Test
    public void findAnagramsTest() {
        int ans = this.subArraySum.subarraySum(new int[]{1,1,1}, 2);
        Assert.assertEquals(2, ans);
    }

}
