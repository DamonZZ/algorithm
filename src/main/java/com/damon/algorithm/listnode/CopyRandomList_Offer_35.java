package com.damon.algorithm.listnode;

public class CopyRandomList_Offer_35 {

    public static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        if (head == null) return head;
        Node cur = head;
        while (cur != null) {
            Node tmp = new Node(cur.val);
            tmp.next = cur.next;
            cur.next = tmp;
            cur = cur.next.next;
        }
        cur = head;
        while (cur != null) {
            if (cur.random != null) {
                cur.next.random = cur.random.next;
            }
            cur = cur.next.next;
        }
        cur = head;
        Node copyHead = head.next;
        Node copyCur = head.next;
        while (cur != null) {
            cur.next = cur.next.next;
            cur = cur.next;
            if (copyCur.next != null) {
                copyCur.next = copyCur.next.next;
                copyCur = copyCur.next;
            }
        }
        return copyHead;
    }

}
