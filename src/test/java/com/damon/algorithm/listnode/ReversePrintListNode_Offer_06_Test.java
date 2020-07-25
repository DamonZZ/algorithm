package com.damon.algorithm.listnode;

import com.damon.algorithm.entity.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReversePrintListNode_Offer_06_Test {

    private ReversePrintListNode_Offer_06 reversePrintListNode_offer_06;

    private ListNode testListNode;

    private int[] expectedArray;

    @Before
    public void before() {
        this.reversePrintListNode_offer_06 = new ReversePrintListNode_Offer_06();
        this.testListNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        this.testListNode.next = listNode2;
        listNode2.next = listNode3;
        this.expectedArray = new int[]{3, 2, 1};
    }

    @Test
    public void ReversePrintTest() {
        int[] result = this.reversePrintListNode_offer_06.reversePrint(this.testListNode);
        Assert.assertEquals(this.expectedArray[1], result[1]);

    }

}
