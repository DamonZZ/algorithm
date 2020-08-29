package com.damon.algorithm.listnode;

import com.damon.algorithm.entity.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MergeTwoLists_Offer_25_Test {

    private MergeTwoLists_Offer_25 mergeTwoLists_offer_25;

    @Before
    public void before() {
        this.mergeTwoLists_offer_25 = new MergeTwoLists_Offer_25();
    }

    @Test
    public void mergeTwoListsTest() {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode11 = new ListNode(2);
        ListNode listNode12 = new ListNode(4);
        listNode11.next = listNode12;
        listNode1.next = listNode11;

        ListNode listNode2 = new ListNode(3);
        ListNode listNode21 = new ListNode(5);
        ListNode listNode22 = new ListNode(6);
        listNode21.next = listNode22;
        listNode2.next = listNode21;

        ListNode result = this.mergeTwoLists_offer_25.mergeTwoLists(listNode1, listNode2);
        Assert.assertEquals(1, result.val);
    }

}
