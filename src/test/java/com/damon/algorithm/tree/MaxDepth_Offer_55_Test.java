package com.damon.algorithm.tree;

import com.damon.algorithm.entity.TreeNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaxDepth_Offer_55_Test {

    private MaxDepth_Offer_55 maxDepth_offer_55;

    @Before
    public void before() {
        this.maxDepth_offer_55 = new MaxDepth_Offer_55();
    }

    @Test
    public void maxDepthTest() {
        TreeNode a = new TreeNode(0);
        TreeNode a1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(2);
        TreeNode a3 = new TreeNode(3);
        TreeNode a4 = new TreeNode(4);
        a.left = a1;
        a.right = a2;
        a1.left = a3;
        a1.right = a4;

        int res = this.maxDepth_offer_55.maxDepth(a);
        Assert.assertEquals(3, res);
    }

    @Test
    public void isBalancedTest() {
        TreeNode a = new TreeNode(0);
        TreeNode a1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(2);
        TreeNode a3 = new TreeNode(3);
        TreeNode a4 = new TreeNode(4);
        a.left = a1;
        a.right = a2;
        a1.left = a3;
        a1.right = a4;

        boolean res = this.maxDepth_offer_55.isBalanced(a);
        Assert.assertTrue(res);
    }
}
