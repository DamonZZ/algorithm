package com.damon.algorithm.listnode;

import com.damon.algorithm.entity.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReverseList_Offer_24_Test {

    private ReverseList_Offer_24 reverseList_offer_24;

    @Before
    public void before() {
        this.reverseList_offer_24 = new ReverseList_Offer_24();
    }

    @Test
    public void everseListTest() {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        listNode1.next = listNode2;
        listNode.next = listNode1;

        ListNode result = this.reverseList_offer_24.reverseList(listNode);
        Assert.assertEquals(3, result.val);
    }

}
