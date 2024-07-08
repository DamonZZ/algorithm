package com.damon.algorithm.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Merge_Hot100_56_Test {

    private Merge_Hot100_56 merge_hot100_56;

    @Before
    public void before() {
        this.merge_hot100_56 = new Merge_Hot100_56();
    }

    @Test
    public void mergeTest() {
        int[][] testNums = new int[][]{
                new int[]{1, 3},
                new int[]{2, 6},
                new int[]{8, 10},
                new int[]{15, 18}
        };
        int[][] result = this.merge_hot100_56.merge(testNums);
        Assert.assertEquals(3, result.length);
    }

}
