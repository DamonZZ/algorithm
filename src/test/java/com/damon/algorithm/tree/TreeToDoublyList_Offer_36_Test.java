package com.damon.algorithm.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TreeToDoublyList_Offer_36_Test {

    private TreeToDoublyList_Offer_36 treeToDoublyList_offer_36;

    @Before
    public void before() {
        this.treeToDoublyList_offer_36 = new TreeToDoublyList_Offer_36();
    }

    @Test
    public void treeToDoublyListTest() {
        TreeToDoublyList_Offer_36.Node node = new TreeToDoublyList_Offer_36.Node(0);
        TreeToDoublyList_Offer_36.Node node1 = new TreeToDoublyList_Offer_36.Node(1);
        TreeToDoublyList_Offer_36.Node node2 = new TreeToDoublyList_Offer_36.Node(2);
        TreeToDoublyList_Offer_36.Node node3 = new TreeToDoublyList_Offer_36.Node(3);
        TreeToDoublyList_Offer_36.Node node4 = new TreeToDoublyList_Offer_36.Node(4);
        node.left = node1;
        node.right = node2;
        node1.left = node3;
        node1.right = node4;

        TreeToDoublyList_Offer_36.Node res = this.treeToDoublyList_offer_36.treeToDoublyList(node);
        Assert.assertEquals(3, res.val);
    }

}
