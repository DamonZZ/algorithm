package com.damon.algorithm.backtrack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class Partition_Hot100_131_Test {


    private Partition_Hot100_131 partition_hot100_131;

    @Before
    public void before() {
        this.partition_hot100_131 = new Partition_Hot100_131();
    }

    @Test
    public void partitionTest() {
        List<List<String>> ans= this.partition_hot100_131.partition("aab");

        Assert.assertEquals(2, ans.size());
    }

}
