package com.damon.algorithm.tree;

import com.damon.algorithm.entity.Node;

public class BinaryTreeImpl implements Tree {

    private Node root;

    public BinaryTreeImpl(int key) {
        this.root = new Node(key);
    }

    @Override
    public Node find(int key) {
        Node current = root;
        while (current != null) {
            int currentData = current.getData();
            if (key > currentData) {
                current = current.getRightChild();
            } else if (key < currentData) {
                current = current.getLeftChild();
            } else {
                return current;
            }
        }
        return null;
    }

    @Override
    public boolean insert(int key) {
        if (this.root == null) {
            this.root = new Node(key);
        } else {
            Node current = this.root;
            Node parentNode = null;
            while (current != null) {
                parentNode = current;
                int currentData = current.getData();
                if (key > currentData) {
                    current = current.getRightChild();
                    if (current == null) {
                        parentNode.setRightChild(new Node(key));
                        return true;
                    }
                } else if (key < currentData) {
                    current = current.getLeftChild();
                    if (current == null) {
                        parentNode.setLeftChild(new Node(key));
                        return true;
                    }
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    @Override
    public boolean delete(int key) {

        // find the delete node
        //Node delNode = null;
        Node parent = this.root;
        Node current = this.root;
        boolean isLeftChild = false;

        while (current.getData() != key) {
            int data = current.getData();
            parent = current;
            if (key > data) {
                isLeftChild = false;
                current = current.getRightChild();
            } else {
                isLeftChild = true;
                current = current.getLeftChild();
            }
            if (current == null) {
                return false;
            }
        }

        // 1. delete node without child
        if (current.getLeftChild() == null && current.getRightChild() == null) {
            if (current == this.root) {
                this.root = null;
            } else if (isLeftChild) {
                parent.setLeftChild(null);
            } else {
                parent.setRightChild(null);
            }
            return true;
        }

        // 2. delete node only has one child
        if (current.getLeftChild() == null && current.getRightChild() != null) {
            if (current == this.root) {
                this.root = current.getRightChild();
            } else if (isLeftChild) {
                parent.setLeftChild(current.getRightChild());
            } else {
                parent.setRightChild(current.getRightChild());
            }
            return true;
        } else if (current.getLeftChild() != null && current.getRightChild() == null) {
            if (current == this.root) {
                this.root = current.getLeftChild();
            } else if (isLeftChild) {
                parent.setLeftChild(current.getLeftChild());
            } else {
                parent.setRightChild(current.getLeftChild());
            }
            return true;
        }

        // 3. delete node has two child
        if (current.getRightChild() != null && current.getLeftChild() != null) {
            // get the successor of the delete node
            Node successor = getSuccessor(current);
            if (current == this.root) {
                this.root = successor;
            } else if (isLeftChild) {
                parent.setLeftChild(successor);
            } else {
                parent.setRightChild(successor);
            }
            successor.setLeftChild(current.getLeftChild());
            return true;
        }

        return false;
    }

    private Node getSuccessor(Node delNode) {
        Node successor = delNode.getRightChild();
        Node current = successor;
        Node successorParent = delNode;
        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.getLeftChild();
        }

        if (successor != delNode.getRightChild()) {
            successorParent.setLeftChild(successor.getRightChild());
            successor.setRightChild(delNode.getRightChild());
        }

        return successor;
    }

    public String preOrder() {
        return preOrder(this.root, "");
    }

    public String infixOrder() {
        return infixOrder(this.root, "");
    }

    public String postOrder() {
        return postOrder(this.root, "");
    }

    private String preOrder(Node current, String result) {
        if (current != null) {
            result = result + current.getData() + " ";
            result = preOrder(current.getLeftChild(), result);
            result = preOrder(current.getRightChild(), result);
        }
        return result;
    }

    private String infixOrder(Node current, String result) {
        if (current != null) {
            result = infixOrder(current.getLeftChild(), result);
            result = result + current.getData() + " ";
            result = infixOrder(current.getRightChild(), result);
        }
        return result;
    }

    private String postOrder(Node current, String result) {
        if (current != null) {
            result = postOrder(current.getLeftChild(), result);
            result = postOrder(current.getRightChild(), result);
            result = result + current.getData() + " ";
        }
        return result;
    }

}
