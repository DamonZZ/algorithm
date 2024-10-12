package com.damon.algorithm.binary;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindMedianSortedArrays_Hot100_4_Test {

    private FindMedianSortedArrays_Hot100_4 findMedianSortedArrays_hot100_4;

    @Before
    public void before() {
        this.findMedianSortedArrays_hot100_4 = new FindMedianSortedArrays_Hot100_4();
    }

    @Test
    public void findMedianSortedArraysTest() {
        int[] nums1 = new int[]{1,3};
        int[] nums2 = new int[]{2};
        double ans = this.findMedianSortedArrays_hot100_4.findMedianSortedArrays(nums1,nums2);
        Assert.assertEquals(2.0, ans,0.0001);
    }

}
