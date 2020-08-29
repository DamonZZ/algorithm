package com.damon.algorithm.listnode;

import com.damon.algorithm.entity.ListNode;

public class GetKthFromEnd_Offer_22 {


    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode former = head, latter = head;
        while (k > 0) {
            former = former.next;
            k--;
        }
        while (former != null) {
            former = former.next;
            latter = latter.next;
        }
        return latter;
    }
}
