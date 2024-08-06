package com.damon.algorithm.tree;

import com.damon.algorithm.entity.TreeNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LowestCommonAncestor_Offer_68_Hot100_Test {

    private LowestCommonAncestor_Offer_68_Hot100_236 lowestCommonAncestor_offer_68;

    @Before
    public void before() {
        this.lowestCommonAncestor_offer_68 = new LowestCommonAncestor_Offer_68_Hot100_236();
    }

    @Test
    public void lowestCommonAncestorTest() {
        TreeNode a = new TreeNode(6);
        TreeNode a1 = new TreeNode(2);
        TreeNode a2 = new TreeNode(8);
        TreeNode a3 = new TreeNode(0);
        TreeNode a4 = new TreeNode(4);

        a.left = a1;
        a.right = a2;
        a1.left = a3;
        a1.right = a4;

        TreeNode res = this.lowestCommonAncestor_offer_68.lowestCommonAncestor(a, a3, a4);
        Assert.assertTrue(res.val == 2);
        res = this.lowestCommonAncestor_offer_68.lowestCommonAncestor2(a, a3, a4);
        Assert.assertTrue(res.val == 2);
        res = this.lowestCommonAncestor_offer_68.lowestCommonAncestor3(a, a3, a4);
        Assert.assertTrue(res.val == 2);
    }

}
