package com.damon.algorithm.listnode;

import com.damon.algorithm.entity.ListNode;

public class DeleteListNode_Offer_18 {

    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) return head;
        if (head.val == val) return head.next;
        head.next = deleteNode(head.next, val);
        return head;
    }

}
