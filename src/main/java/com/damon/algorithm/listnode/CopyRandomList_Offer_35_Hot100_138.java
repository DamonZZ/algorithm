package com.damon.algorithm.listnode;

import java.util.HashMap;
import java.util.Map;

public class CopyRandomList_Offer_35_Hot100_138 {


    Map<Node, Node> cachedNode = new HashMap();

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

    public Node copyRandomList2(Node head) {
        if (head == null)
            return head;

        if (!cachedNode.containsKey(head)) {
            Node node = new Node(head.val);
            cachedNode.put(head, node);
            node.next = copyRandomList(head.next);
            node.random = copyRandomList(head.random);
        }

        return cachedNode.get(head);
    }

}
