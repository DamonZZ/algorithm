package com.damon.algorithm.tree;

import com.damon.algorithm.entity.TreeNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaxPathSum_Hot100_124_Test {

    private MaxPathSum_Hot100_124 maxPathSum_hot100_124;

    @Before
    public void before() {
        this.maxPathSum_hot100_124 = new MaxPathSum_Hot100_124();
    }

    @Test
    public void maxPathSumTest() {
        TreeNode a = new TreeNode(-10);
        TreeNode a1 = new TreeNode(9);
        TreeNode a2 = new TreeNode(20);
        TreeNode a3 = new TreeNode(15);
        TreeNode a4 = new TreeNode(7);
        a.left = a1;
        a.right = a2;
        a2.left = a3;
        a2.right = a4;

        int res = this.maxPathSum_hot100_124.maxPathSum(a);
        Assert.assertEquals(42, res);
    }
}
