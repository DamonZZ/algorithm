package com.damon.algorithm.tree;

import com.damon.algorithm.entity.TreeNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class InorderTraversal_Hot100_94_Test {


    private InorderTraversal_Hot100_94 inorderTraversal_hot100_94;

    @Before
    public void before() {
        this.inorderTraversal_hot100_94 = new InorderTraversal_Hot100_94();
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

        List result = this.inorderTraversal_hot100_94.inorderTraversal(a);
        Assert.assertEquals(2, result.get(2));
    }

}
