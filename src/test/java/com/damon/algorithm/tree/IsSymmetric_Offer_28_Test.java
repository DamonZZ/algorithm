package com.damon.algorithm.tree;

import com.damon.algorithm.entity.TreeNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IsSymmetric_Offer_28_Test {

    private IsSymmetric_Offer_28 isSymmetric_offer_28;

    @Before
    public void before() {
        this.isSymmetric_offer_28 = new IsSymmetric_Offer_28();
    }

    @Test
    public void isSymmetricTest() {
        TreeNode a = new TreeNode(0);
        TreeNode a1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(2);
        TreeNode a3 = new TreeNode(3);
        TreeNode a4 = new TreeNode(4);

        a.left = a1;
        a.right = a2;
        a1.left = a3;
        a1.right = a4;

        boolean result = this.isSymmetric_offer_28.isSymmetric(a);
        Assert.assertEquals(false, result);
    }
}
