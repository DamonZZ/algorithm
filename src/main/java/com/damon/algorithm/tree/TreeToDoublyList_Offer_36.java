package com.damon.algorithm.tree;

public class TreeToDoublyList_Offer_36 {

    public static class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }

    private Node head = null, pre = null;

    public Node treeToDoublyList(Node root) {
        if (root == null) return root;
        this.inorder(root);
        this.head.left = this.pre;
        this.pre.right = this.head;
        return this.head;
    }

    private void inorder(Node cur) {
        if (cur == null) return;
        this.inorder(cur.left);
        if (this.pre == null) {
            this.head = cur;
        } else {
            this.pre.right = cur;
        }
        cur.left = this.pre;
        this.pre = cur;
        this.inorder(cur.right);
    }

}
