package com.damon.algorithm.tree;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinaryTreeTest {

    private BinaryTree binaryTree;

    @Before
    public void before() {
        this.binaryTree = new BinaryTree();
    }

    @After
    public void after() {
        this.binaryTree = null;
    }

    @Test
    public void VerifySquenceOfBST() {
        int[] testSequence = new int[]{5, 7, 6, 9, 11, 10, 8};
        boolean expected = true;
        boolean result = false;

        result = this.binaryTree.VerifySquenceOfBST(testSequence);
        Assert.assertEquals(expected, result);

        testSequence = new int[]{7, 4, 6, 5};
        expected = false;
        result = this.binaryTree.VerifySquenceOfBST(testSequence);
        Assert.assertEquals(expected, result);

    }


}
