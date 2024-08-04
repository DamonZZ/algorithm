package com.damon.algorithm.tree;

import com.damon.algorithm.entity.TreeNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Flatten_Hot100_114_Test {

    private Flatten_Hot100_114 flatten_hot100_114;

    @Before
    public void before() {
        this.flatten_hot100_114 = new Flatten_Hot100_114();
    }

    @Test
    public void inorderTraversalTest() {
        TreeNode a = new TreeNode(1);
        TreeNode a1 = new TreeNode(2);
        TreeNode a2 = new TreeNode(3);


        a.left = null;
        a.right = a1;
        a1.left = a2;
        a1.right = null;

        TreeNode ans = a;
        this.flatten_hot100_114.flatten(a);
        Assert.assertEquals(3, a.right.right.right.val);
    }

}
