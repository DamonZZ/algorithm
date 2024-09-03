package com.damon.algorithm.heap;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindKthLargest_Hot100_215_Test {

    private FindKthLargest_Hot100_215 findKthLargest_hot100_215;

    @Before
    public void before() {
        this.findKthLargest_hot100_215 = new FindKthLargest_Hot100_215();
    }


    @Test
    public void findKthLargestTest() {
        int[] nums = new int[]{3,2,1,5,6,4};
        int ans = this.findKthLargest_hot100_215.findKthLargest(nums,2);
        Assert.assertEquals(5,ans);
    }

}
