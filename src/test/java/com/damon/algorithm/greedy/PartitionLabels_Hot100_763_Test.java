package com.damon.algorithm.greedy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class PartitionLabels_Hot100_763_Test {


    private PartitionLabels_Hot100_763 partitionLabels_hot100_763;

    @Before
    public void before() {
        this.partitionLabels_hot100_763 = new PartitionLabels_Hot100_763();
    }


    @Test
    public void partitionLabelsTest() {
        List<Integer> ans = this.partitionLabels_hot100_763.partitionLabels("ababcbacadefegdehijhklij");
        Assert.assertEquals(3, ans.size());
    }

}
