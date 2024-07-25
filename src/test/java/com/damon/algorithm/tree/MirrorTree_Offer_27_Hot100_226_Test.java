package com.damon.algorithm.tree;

import com.damon.algorithm.entity.TreeNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MirrorTree_Offer_27_Hot100_226_Test {

    private MirrorTree_Offer_27_Hot100_226 mirrorTree_offer_27;

    @Before
    public void before() {
        this.mirrorTree_offer_27 = new MirrorTree_Offer_27_Hot100_226();
    }

    @Test
    public void irrorTreeTest() {
        TreeNode a = new TreeNode(0);
        TreeNode a1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(2);
        TreeNode a3 = new TreeNode(3);
        TreeNode a4 = new TreeNode(4);
        a.left = a1;
        a.right = a2;
        a1.left = a3;
        a1.right = a4;

        TreeNode result = this.mirrorTree_offer_27.mirrorTree(a);
        Assert.assertEquals(2, result.left.val);
    }

}
