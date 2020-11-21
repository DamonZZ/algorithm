package com.damon.algorithm.listnode;

import com.damon.algorithm.entity.ListNode;

public class IntersectionNode_Offer_52 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode listNode1 = headA;
        ListNode listNode2 = headB;

        while (listNode1 != listNode2) {
            listNode1 = listNode1 == null ? headB : listNode1.next;
            listNode2 = listNode2 == null ? headA : listNode2.next;
        }
        return listNode1;
    }

}
