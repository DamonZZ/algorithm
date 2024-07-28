package com.damon.algorithm.tree;

import com.damon.algorithm.entity.TreeNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DiameterOfBinaryTree_Hot100_Test {

    private DiameterOfBinaryTree_Hot100 diameterOfBinaryTree_Hot100;

    @Before
    public void before() {
        this.diameterOfBinaryTree_Hot100 = new DiameterOfBinaryTree_Hot100();
    }

    @Test
    public void diameterOfBinaryTreeTest() {
        TreeNode a = new TreeNode(1);
        TreeNode a1 = new TreeNode(2);
        TreeNode a2 = new TreeNode(3);


        a.left = null;
        a.right = a1;
        a1.left = a2;
        a1.right = null;

        int result = this.diameterOfBinaryTree_Hot100.diameterOfBinaryTree(a);
        Assert.assertEquals(2, result);
    }

}
