package com.damon.algorithm.tree;

import com.damon.algorithm.entity.TreeNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class PathSum_Offer_34_Test {

    private PathSum_Offer_34 pathSum_offer_34;

    @Before
    public void before() {
        this.pathSum_offer_34 = new PathSum_Offer_34();
    }

    @Test
    public void pathSumTest() {
        TreeNode a = new TreeNode(0);
        TreeNode a1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(2);
        TreeNode a3 = new TreeNode(3);
        TreeNode a4 = new TreeNode(4);
        a.left = a1;
        a.right = a2;
        a1.left = a3;
        a1.right = a4;

        List<List<Integer>> res = this.pathSum_offer_34.pathSum(a, 4);
        Assert.assertEquals(1, res.size());
    }

}
