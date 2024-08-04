package com.damon.algorithm.tree;

import com.damon.algorithm.entity.TreeNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BuildTree_Offer_07_Hot100_105_Test {

    private BuildTree_Offer_07_Hot100_105 buildTree_offer_07_hot100_105;

    @Before
    public void before() {
        this.buildTree_offer_07_hot100_105 = new BuildTree_Offer_07_Hot100_105();
    }

    @Test
    public void buildTreeTest() {

        int[] preorder = new int[]{3,9,20,15,7};
        int[] inorder = new int[]{9,3,15,20,7};
        TreeNode ans = this.buildTree_offer_07_hot100_105.buildTree2(preorder,inorder);
        Assert.assertEquals(7, ans.right.right.val);
    }

}
