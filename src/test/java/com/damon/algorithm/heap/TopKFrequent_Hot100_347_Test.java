package com.damon.algorithm.heap;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TopKFrequent_Hot100_347_Test {

    private TopKFrequent_Hot100_347 topKFrequent_hot100_347;

    @Before
    public void before() {
        this.topKFrequent_hot100_347 = new TopKFrequent_Hot100_347();
    }


    @Test
    public void topKFrequentTest() {
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        int[] expected = new int[]{2, 1};
        int[] ans = this.topKFrequent_hot100_347.topKFrequent(nums, 2);
        for (int i = 0; i < expected.length; i++) {
            Assert.assertEquals(expected[i], ans[i]);
        }
    }

}
