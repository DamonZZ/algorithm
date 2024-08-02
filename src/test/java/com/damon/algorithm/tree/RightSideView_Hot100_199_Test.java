package com.damon.algorithm.tree;

import com.damon.algorithm.entity.TreeNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class RightSideView_Hot100_199_Test {


    private RightSideView_Hot100_199 rightSideView_hot100_199;

    @Before
    public void before() {
        this.rightSideView_hot100_199 = new RightSideView_Hot100_199();
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

        List result = this.rightSideView_hot100_199.rightSideViewDsf(a);
        Assert.assertEquals(3, result.size());
    }

}
