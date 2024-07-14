package com.damon.algorithm.listnode;

import com.damon.algorithm.entity.ListNode;

public class ReverseList_Offer_24_Hot100_206 {

    public ListNode reverseList(ListNode head) {
        ListNode pre = null, cur = head, next = null;
        while (cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

}
