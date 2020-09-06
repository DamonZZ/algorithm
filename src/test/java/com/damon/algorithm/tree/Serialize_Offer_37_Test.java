package com.damon.algorithm.tree;

import com.damon.algorithm.entity.TreeNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Serialize_Offer_37_Test {

    private Serialize_Offer_37 serialize_offer_37;

    private TreeNode testTree;

    @Before
    public void before() {
        this.serialize_offer_37 = new Serialize_Offer_37();
        this.testTree = new TreeNode(0);
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        this.testTree.left = treeNode1;
        this.testTree.right = treeNode2;
        treeNode1.left = treeNode3;
        treeNode1.right = treeNode4;
    }

    @Test
    public void serializeTest() {
        String res = this.serialize_offer_37.serialize(this.testTree);
        Assert.assertNotNull(res);
    }

    @Test
    public void deserializeTest() {
        String test = "[0,1,2,3,4,null,null,null,null,null,null]";
        TreeNode treeNode = this.serialize_offer_37.deserialize(test);
        Assert.assertNotNull(treeNode);
    }

}
