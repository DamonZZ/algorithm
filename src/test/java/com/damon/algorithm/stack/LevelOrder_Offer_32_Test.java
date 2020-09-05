package com.damon.algorithm.stack;

import com.damon.algorithm.entity.TreeNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class LevelOrder_Offer_32_Test {

    private LevelOrder_Offer_32 levelOrder_offer_32;

    private TreeNode testNode;

    @Before
    public void before() {
        this.levelOrder_offer_32 = new LevelOrder_Offer_32();
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
    public void levelOrderTest() {
        int[] result = this.levelOrder_offer_32.levelOrder(this.testNode);
        Assert.assertTrue(result.length > 0);
    }

    @Test
    public void levelOrder2Test() {
        List<List<Integer>> result = this.levelOrder_offer_32.levelOrder2(this.testNode);
        int root = result.get(0).get(0);
        Assert.assertEquals(0, root);
    }


}
