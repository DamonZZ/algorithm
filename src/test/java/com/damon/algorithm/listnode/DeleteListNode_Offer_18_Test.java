package com.damon.algorithm.listnode;

import com.damon.algorithm.entity.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DeleteListNode_Offer_18_Test {

    private DeleteListNode_Offer_18 deleteListNode_offer_18 = new DeleteListNode_Offer_18();

    ListNode head = new ListNode(0);

    @Before
    public void before() {
        ListNode element1 = new ListNode(1);
        ListNode element2 = new ListNode(2);
        ListNode element3 = new ListNode(3);
        this.head.next = element1;
        element1.next = element2;
        element2.next = element3;

    }

    @Test
    public void deleteListNodeTest() {
        int result = this.deleteListNode_offer_18.deleteNode(this.head, 0).val;
        Assert.assertEquals(1, result);
    }


}
