package com.damon.algorithm.tree;

import com.damon.algorithm.entity.TreeNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinaryTree_KthLargest_Offer_54_Test {

    private BinaryTree_KthLargest_Offer_54 binaryTree_kthLargest_offer_54;

    @Before
    public void before() {
        this.binaryTree_kthLargest_offer_54 = new BinaryTree_KthLargest_Offer_54();
    }

    @Test
    public void kthLargestTest() {
        TreeNode testTreeNode = new TreeNode(0);
        TreeNode leftNode = new TreeNode(1);
        TreeNode rightNode = new TreeNode(2);
        testTreeNode.left = leftNode;
        testTreeNode.right = rightNode;
        int result = this.binaryTree_kthLargest_offer_54.kthLargest(testTreeNode, 1);
        Assert.assertEquals(2, result);
    }

}
