package com.damon.algorithm.listnode;

import com.damon.algorithm.entity.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReverseList_Offer_24_Hot100_206_Test {

    private ReverseList_Offer_24_Hot100_206 reverseList_offer_24_hot100_206;

    @Before
    public void before() {
        this.reverseList_offer_24_hot100_206 = new ReverseList_Offer_24_Hot100_206();
    }

    @Test
    public void reverseListTest() {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        listNode1.next = listNode2;
        listNode.next = listNode1;

        ListNode result = this.reverseList_offer_24_hot100_206.reverseList(listNode);
        Assert.assertEquals(3, result.val);
    }

}
