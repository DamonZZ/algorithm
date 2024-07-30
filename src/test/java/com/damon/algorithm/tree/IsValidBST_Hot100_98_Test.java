package com.damon.algorithm.tree;

import com.damon.algorithm.entity.TreeNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IsValidBST_Hot100_98_Test {

    private IsValidBST_Hot100_98 isValidBST_hot100_98;

    private TreeNode testNode;

    @Before
    public void before() {
        this.isValidBST_hot100_98 = new IsValidBST_Hot100_98();
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
    public void isValidBSTTest() {
        boolean result = this.isValidBST_hot100_98.isValidBST2(this.testNode);
        Assert.assertFalse(result);
    }

}
