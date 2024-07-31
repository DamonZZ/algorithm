package com.damon.algorithm.tree;

import com.damon.algorithm.entity.TreeNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class KthSmallest_Hot100_230_Test {

    private KthSmallest_Hot100_230 kthSmallest_hot100_230;

    private TreeNode testNode;

    @Before
    public void before() {
        this.kthSmallest_hot100_230 = new KthSmallest_Hot100_230();
        this.testNode = new TreeNode(0);
        TreeNode a1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(2);
        TreeNode a3 = new TreeNode(3);
        TreeNode a4 = new TreeNode(4);

        this.testNode.left = a1;
        this.testNode.right = a2;
        a1.left = a3;
        a1.right = a4;
    }

    @Test
    public void kthSmallestTest() {
        int result = this.kthSmallest_hot100_230.kthSmallest(this.testNode, 2);
        Assert.assertEquals(1, result);
    }

}
