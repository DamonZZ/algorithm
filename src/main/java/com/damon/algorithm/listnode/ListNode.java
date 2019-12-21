package com.damon.algorithm.listnode;

import com.damon.algorithm.entity.Node;
import com.sun.scenario.effect.Merge;

import java.util.ArrayList;
import java.util.Queue;

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

    public Node merge(Node node1, Node node2) {
        if (node1 == null) {
            return node2;
        } else if (node2 == null) {
            return node1;
        }

        Node result = null;

        int data1 = node1.getData();
        int data2 = node2.getData();

        if (data1 < data2) {
            result = node1;
            result.setLeftChild(this.merge(result.getLeftChild(), node2));
        } else {
            result = node2;
            result.setLeftChild(this.merge(node1, result.getLeftChild()));
        }
        return result;
    }

    public boolean hasSubTree(Node node1, Node node2) {
        boolean result = false;

        if (node1 == null || node2 == null) {
            return false;
        }

        int data1 = node1.getData();
        int data2 = node2.getData();

        if (data1 == data2) {
            result = this.doesTree1HasTree2(node1, node2);
        }

        if (!result) {
            result = this.hasSubTree(node1.getLeftChild(), node2);
        }

        if (!result) {
            result = this.hasSubTree(node1.getRightChild(), node2);
        }

        return result;
    }

    public void mirror(Node node) {

        if (node == null) {
            return;
        }

        Node leftChild = node.getLeftChild();
        Node rightChild = node.getRightChild();

        // switch
        node.setLeftChild(rightChild);
        node.setRightChild(leftChild);

        this.mirror(node.getLeftChild());
        this.mirror(node.getRightChild());
    }

    private boolean doesTree1HasTree2(Node node1, Node node2) {
        if (node2 == null) {
            return true;
        }

        if (node1 == null) {
            return false;
        }

        if (node1.getData() != node2.getData()) {
            return false;
        }

        return this.doesTree1HasTree2(node1.getLeftChild(), node2.getLeftChild()) && this.doesTree1HasTree2(node1.getRightChild(), node2.getRightChild());
    }

    public ArrayList<Integer> printFromTopToBottom(Node root) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Node> nodes = new ArrayList<>();
        if (root == null) {
            return arrayList;
        }

        nodes.add(root);
        while (nodes.size() != 0) {
            Node node = nodes.remove(0);
            if (node.getLeftChild() != null) {
                nodes.add(node.getLeftChild());
            }
            if (node.getLeftChild() != null) {
                nodes.add(node.getRightChild());
            }
            arrayList.add(node.getData());
        }

        return arrayList;
    }

    public ArrayList<ArrayList<Integer>> findPath(Node root, int target) {
        ArrayList<ArrayList<Integer>> arrs = new ArrayList<>();
        if (root == null) {
            return arrs;
        }

        ArrayList<Integer> arr = new ArrayList<>();
        int sum = 0;
        this.findPathInChildren(sum, target, root, arrs, arr);
        return arrs;
    }

    private void findPathInChildren(int sum, int target, Node root, ArrayList<ArrayList<Integer>> arrs, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }

        sum += root.getData();
        if (root.getLeftChild() == null && root.getRightChild() == null) {
            if (sum == target) {
                arr.add(root.getData());
                arrs.add(new ArrayList<Integer>(arr));
                arr.remove(arr.size() - 1);
            }
            return;
        }

        arr.add(root.getData());
        this.findPathInChildren(sum, target, root.getLeftChild(), arrs, arr);
        this.findPathInChildren(sum, target, root.getRightChild(), arrs, arr);
        arr.remove(arr.size() - 1);
    }

    private Node pre = null;

    public Node convert(Node pRootOfTree) {
        if (pRootOfTree == null) {
            return null;
        }

        this.pre = null;
        this.convertSub(pRootOfTree);

        while (pRootOfTree.getLeftChild() != null) {
            pRootOfTree = pRootOfTree.getLeftChild();
        }

        return pRootOfTree;
    }

    private void convertSub(Node current) {
        if (current == null) {
            return;
        }

        this.convertSub(current.getLeftChild());

        current.setLeftChild(this.pre);
        if (this.pre != null) {
            this.pre.setRightChild(current);
        }

        this.pre = current;
        this.convertSub(current.getRightChild());
    }


}
