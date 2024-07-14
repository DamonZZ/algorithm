package com.damon.algorithm.listnode;

import com.damon.algorithm.entity.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntersectionNode_Offer_52_Hot100_160_Test {

    private IntersectionNode_Offer_52_Hot100_160 intersectionNode_offer_52;

    @Before
    public void before() {
        this.intersectionNode_offer_52 = new IntersectionNode_Offer_52_Hot100_160();
    }

    @Test
    public void getIntersectionNode() {
        ListNode nodeTest1 = new ListNode(1);
        ListNode nodeTest2 = new ListNode(2);


        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        ListNode node5 = new ListNode(5);

        node3.next = node5;
        node4.next = node5;

        nodeTest1.next = node3;
        nodeTest2.next = node4;

        ListNode expected = node5;

        Assert.assertEquals(node5, this.intersectionNode_offer_52.getIntersectionNode(nodeTest1, nodeTest2));

    }

}
