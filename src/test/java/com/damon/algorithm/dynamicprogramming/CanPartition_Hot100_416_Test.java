package com.damon.algorithm.dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

public class CanPartition_Hot100_416_Test {

    private CanPartition_Hot100_416 canPartition_hot100_416 = new CanPartition_Hot100_416();

    @Test
    public void canPartitionTest() {
        int[] nums = new int[]{1, 5, 11, 5};
        boolean ans = this.canPartition_hot100_416.canPartition(nums);
        Assert.assertEquals(true, ans);
    }

}
