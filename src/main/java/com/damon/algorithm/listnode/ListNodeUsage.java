package com.damon.algorithm.listnode;

import com.damon.algorithm.entity.ListNode;

public class ListNodeUsage {

    public ListNode findFirstCommonNode(ListNode pHead1, ListNode pHead2) {

        if (pHead1 == null || pHead2 == null) {
            return null;
        }

        int listNodeLength1 = this.getListNodeLength(pHead1);
        int listNodeLength2 = this.getListNodeLength(pHead2);

        int flag = listNodeLength1 - listNodeLength2;
        if (flag > 0) {
            for (int i = 0; i < flag; i++) {
                pHead1 = pHead1.next;
            }
        } else {
            flag = -flag;
            for (int i = 0; i < flag; i++) {
                pHead2 = pHead2.next;
            }
        }

        while (pHead1 != pHead2) {
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }
        return pHead1;
    }

    private int getListNodeLength(ListNode listNode) {
        int count = 0;
        ListNode temp = listNode;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

}
