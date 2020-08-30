package com.damon.algorithm.tree;

import com.damon.algorithm.entity.TreeNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IsSubStructure_Offer_26_Test {

    private IsSubStructure_Offer_26 isSubStructure_offer_26;

    @Before
    public void before() {
        this.isSubStructure_offer_26 = new IsSubStructure_Offer_26();
    }

    @Test
    public void IsSubStructureTest() {
        TreeNode a = new TreeNode(0);
        TreeNode a1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(2);
        TreeNode a3 = new TreeNode(3);
        TreeNode a4 = new TreeNode(4);

        a.left = a1;
        a.right = a2;
        a1.left = a3;
        a1.right = a4;

        TreeNode b = new TreeNode(1);
        TreeNode b1 = new TreeNode(3);
        TreeNode b2 = new TreeNode(4);

        b.left = b1;
        b.right = b2;

        boolean result = this.isSubStructure_offer_26.isSubStructure(a, b);
        Assert.assertEquals(true, result);
    }
}
