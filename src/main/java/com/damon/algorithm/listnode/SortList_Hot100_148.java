package com.damon.algorithm.listnode;

import com.damon.algorithm.entity.ListNode;

public class SortList_Hot100_148 {

    public ListNode sortList(ListNode head) {
        if (head == null) {
            return head;
        }
        int length = 0;
        ListNode node = head;
        while (node != null) {
            length++;
            node = node.next;
        }

        ListNode dummyHead = new ListNode(0, head);

        for (int subLength = 1; subLength < length; subLength <<= 1) {
            ListNode prev = dummyHead, curr = dummyHead.next;
            while (curr != null) {
                ListNode head1 = curr;
                for (int i = 1; i < subLength && curr.next != null; i++) {
                    curr = curr.next;
                }

                ListNode head2 = curr.next;
                curr.next = null;
                curr = head2;

                for (int i = 1; i < subLength && curr != null && curr.next != null; i++) {
                    curr = curr.next;
                }

                ListNode next = null;
                if (curr != null) {
                    next = curr.next;
                    curr.next = null;
                }
                ListNode merged = merge(head1, head2);
                prev.next = merged;
                while (prev.next != null) {
                    prev = prev.next;
                }
                curr = next;

                 print(dummyHead.next);
            }

//            print(dummyHead.next);
        }

        return dummyHead.next;
    }

    private ListNode merge(ListNode head1, ListNode head2) {
        ListNode dummyHead = new ListNode(0);
        ListNode teamp = dummyHead, teamp1 = head1, teamp2 = head2;
        while (teamp1 != null && teamp2 != null) {
            if (teamp1.val <= teamp2.val) {
                teamp.next = teamp1;
                teamp1 = teamp1.next;
            } else {
                teamp.next = teamp2;
                teamp2 = teamp2.next;
            }
            teamp = teamp.next;
        }

        if (teamp1 != null) {
            teamp.next = teamp1;
        } else if (teamp2 != null) {
            teamp.next = teamp2;
        }
        return dummyHead.next;
    }

    private void print(ListNode listNode){
        ListNode dummyNode = new ListNode(0,listNode);
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (dummyNode.next !=null){
            sb.append(dummyNode.next.val);
            sb.append(",");
            dummyNode = dummyNode.next;
        }
        sb.deleteCharAt(sb.length()-1);
        sb.append("]");
        System.out.println(sb.toString());
    }

}
