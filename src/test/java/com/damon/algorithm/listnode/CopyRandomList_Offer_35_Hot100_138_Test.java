package com.damon.algorithm.listnode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CopyRandomList_Offer_35_Hot100_138_Test {

    private CopyRandomList_Offer_35_Hot100_138 copyRandomList_offer_35;

    @Before
    public void before() {
        this.copyRandomList_offer_35 = new CopyRandomList_Offer_35_Hot100_138();
    }

    @Test
    public void copyRandomListTest() {
        CopyRandomList_Offer_35_Hot100_138.Node node = new CopyRandomList_Offer_35_Hot100_138.Node(0);
        CopyRandomList_Offer_35_Hot100_138.Node node1 = new CopyRandomList_Offer_35_Hot100_138.Node(1);
        CopyRandomList_Offer_35_Hot100_138.Node node2 = new CopyRandomList_Offer_35_Hot100_138.Node(2);
        CopyRandomList_Offer_35_Hot100_138.Node node3 = new CopyRandomList_Offer_35_Hot100_138.Node(3);
        CopyRandomList_Offer_35_Hot100_138.Node node4 = new CopyRandomList_Offer_35_Hot100_138.Node(4);
        node.next = node1;
        node.random = null;
        node1.next = node2;
        node1.random = node3;
        node2.next = node3;
        node2.random = node1;
        node3.next = node4;
        node3.random = null;
        node4.next = null;
        node4.random = node2;
        CopyRandomList_Offer_35_Hot100_138.Node res = this.copyRandomList_offer_35.copyRandomList(node);
        Assert.assertEquals(0, res.val);

        res = this.copyRandomList_offer_35.copyRandomList2(node);
        Assert.assertEquals(0, res.val);
    }

}
