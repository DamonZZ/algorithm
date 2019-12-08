package com.damon.algorithm.listnode;

import com.damon.algorithm.entity.Node;

public class ListNode {

    public Node findKthFromTail(Node node, int k) {
        Node result = null;
        if (node == null || k <= 0) {
            return result;
        }

        Node first = node;
        for (int i = 1; i < k; i++) {
            first = first.getLeftChild();
            if (first == null) {
                return result;
            }
        }

        result = node;
        while (first.getLeftChild() != null) {
            first = first.getLeftChild();
            result = result.getLeftChild();
        }
        return result;
    }

    public Node reverseList(Node head) {
        Node result = null;
        if (head == null) {
            return result;
        }

        Node preNode = null;
        Node nextNode = null;

        while (head != null) {
            nextNode = head.getLeftChild();
            head.setLeftChild(preNode);
            preNode = head;
            head = nextNode;

        }

        return preNode;
    }

}
