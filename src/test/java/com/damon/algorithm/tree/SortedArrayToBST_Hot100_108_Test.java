package com.damon.algorithm.tree;

import com.damon.algorithm.entity.TreeNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SortedArrayToBST_Hot100_108_Test {


    private SortedArrayToBST_Hot100_108 sortedArrayToBST_hot100_108;

    @Before
    public void before() {
        this.sortedArrayToBST_hot100_108 = new SortedArrayToBST_Hot100_108();
    }

    @Test
    public void diameterOfBinaryTreeTest() {
        int[] nums = new int[]{-10,-3,0,5,9};

        TreeNode result = this.sortedArrayToBST_hot100_108.sortedArrayToBST(nums);
        Assert.assertEquals(0, result.val);
    }

}
