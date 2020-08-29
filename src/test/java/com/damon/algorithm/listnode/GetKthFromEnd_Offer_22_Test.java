package com.damon.algorithm.listnode;

import com.damon.algorithm.entity.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GetKthFromEnd_Offer_22_Test {

    private GetKthFromEnd_Offer_22 getKthFromEnd_offer_22;

    @Before
    public void before() {
        this.getKthFromEnd_offer_22 = new GetKthFromEnd_Offer_22();
    }


    @Test
    public void getKthFromEndTest() {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        listNode1.next = listNode2;
        listNode.next = listNode1;

        ListNode result = this.getKthFromEnd_offer_22.getKthFromEnd(listNode, 1);
        Assert.assertEquals(3, result.val);
    }
}
